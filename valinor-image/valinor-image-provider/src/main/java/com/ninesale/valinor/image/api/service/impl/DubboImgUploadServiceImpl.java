package com.ninesale.valinor.image.api.service.impl;

import java.io.FileInputStream;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.image.api.model.request.DubboAddImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboImgUploadRequest;
import com.ninesale.valinor.image.api.model.response.DubboAddImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboImgUploadResponse;
import com.ninesale.valinor.image.api.model.response.DubboImgUploadSignResponse;
import com.ninesale.valinor.image.api.service.DubboImgUploadService;
import com.ninesale.valinor.image.constant.ImageUploadConstants;
import com.ninesale.valinor.image.provider.model.DtoImgStore;
import com.ninesale.valinor.image.provider.service.ImgStoreService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;
import com.qcloud.PicCloud;
import com.qcloud.UploadResult;

public class DubboImgUploadServiceImpl implements DubboImgUploadService {
	private static final Logger logger = Logger.getLogger(DubboImgUploadServiceImpl.class);
	
	@Resource
	private ImgStoreService imgStoreService;
	
	/**
	 * 后台模拟图片上传
	 * 已经废弃
	 * 万象优图替代图片上传
	 * */
	public DubboImgUploadResponse uploadImg(DubboImgUploadRequest dubboImgUploadRequest) {
		DubboImgUploadResponse dubboImgUploadResponse = new DubboImgUploadResponse();
		PicCloud pc = new PicCloud(ImageUploadConstants.PROJECT_ID, 
				ImageUploadConstants.SECRET_ID, 
				ImageUploadConstants.SECRET_KEY, 
				ImageUploadConstants.SPACE_NAME);
        try {
        	UploadResult uploadResult = picUpdateBase(pc, dubboImgUploadRequest.getFileUrl());
        	if(StringUtils.isNotBlank(uploadResult.downloadUrl)){
        		//保存图片地址信息（根据万象优图返回的地址信息copy一份地址信息保存公司服务器中）
        		DubboAddImgStoreRequest dubboAddImgStoreRequest = new DubboAddImgStoreRequest();
        		initDubboAddImgStoreRequest(dubboAddImgStoreRequest,dubboImgUploadRequest, uploadResult); 
        		DubboAddImgStoreResponse dubboAddImgStoreResponse = insert(dubboAddImgStoreRequest);
        		if(dubboAddImgStoreResponse!=null && 0 ==dubboAddImgStoreResponse.getCode()){
        			dubboImgUploadResponse.setiCount(dubboAddImgStoreResponse.getiCount()); 
        			dubboImgUploadResponse.setCode(0); 
        			dubboImgUploadResponse.setId(dubboAddImgStoreResponse.getId()); 
        		}else{
        			dubboImgUploadResponse.setCode(4);
        			dubboImgUploadResponse.setDesc("上传图片异常");
        		}
        	}else{
        		dubboImgUploadResponse.setCode(4);
        		dubboImgUploadResponse.setDesc("上传图片异常");
        	}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"上传图片异常");
		}
        return dubboImgUploadResponse;
	}
	
	/**
	 * 文件上传到腾讯万象优云服务器
	 * 
	 * */
	public UploadResult picUpdateBase(PicCloud pc, String pic) throws Exception {
		UploadResult result = new UploadResult();
        //2. 文件流的方式
        FileInputStream fileStream = new FileInputStream(pic);
        pc.upload(fileStream, result);
        logger.info("fileId=="+result.fileId+" downloadUrl=="+result.downloadUrl+" url=="+result.url); 
        return result;
	}
	
	/**
	 * 保存图片路径信息(存储公司服务器)
	 * 
	 * */
	private DubboAddImgStoreResponse insert(DubboAddImgStoreRequest dubboAddImgStoreRequest) {
		logger.info("***start***ImgUploadServiceImpl.insert***start***"); 
		logger.info(dubboAddImgStoreRequest.toString()); 
		DubboAddImgStoreResponse dubboAddImgStoreResponse = new DubboAddImgStoreResponse();
		DtoImgStore imgStore = BeanMapper.map(dubboAddImgStoreRequest, DtoImgStore.class);
		logger.info(imgStore.toString());
		Map<String, Object> map = null;
		try {
			map = imgStoreService.insert(imgStore);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"保存图片信息异常");
		}
		if(map!=null && map.size()>0){
			dubboAddImgStoreResponse.setCode(0);
			dubboAddImgStoreResponse.setiCount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			dubboAddImgStoreResponse.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			dubboAddImgStoreResponse.setCode(4);
			dubboAddImgStoreResponse.setDesc("没有数据可保存");  
		}
		logger.info(dubboAddImgStoreResponse.toString());
		logger.info("***end***ImgUploadServiceImpl.insert***end***");
		return dubboAddImgStoreResponse;
	}
	
	private void initDubboAddImgStoreRequest(DubboAddImgStoreRequest dubboAddImgStoreRequest,DubboImgUploadRequest dubboImgUploadRequest,UploadResult uploadResult){
		if(dubboImgUploadRequest!=null){
			dubboAddImgStoreRequest.setTypeId(dubboImgUploadRequest.getTypeId());
			dubboAddImgStoreRequest.setCreateTime(dubboImgUploadRequest.getCreateTime()); 
			dubboAddImgStoreRequest.setUpdateTime(dubboImgUploadRequest.getCreateTime());
			dubboAddImgStoreRequest.setImageText(dubboImgUploadRequest.getImageText()); 
		}
		if(uploadResult!=null){
			dubboAddImgStoreRequest.setDownloadUrl(uploadResult.downloadUrl);
			dubboAddImgStoreRequest.setManageUrl(uploadResult.url);
			dubboAddImgStoreRequest.setFileId(uploadResult.fileId);
		}
	}

	@Override
	public DubboImgUploadSignResponse createSign() {
		PicCloud pc = new PicCloud(ImageUploadConstants.PROJECT_ID, 
				ImageUploadConstants.SECRET_ID, 
				ImageUploadConstants.SECRET_KEY, 
				ImageUploadConstants.SPACE_NAME);
        long expired = System.currentTimeMillis() / 1000 + 3600;
        String sign = pc.getSign(expired);
        
        String url = ImageUploadConstants.BASE_URL+UUID.randomUUID().toString().replaceAll("\\-", "");
        DubboImgUploadSignResponse dubboImgUploadSignResponse = new DubboImgUploadSignResponse();
        dubboImgUploadSignResponse.setSign(sign); 
        dubboImgUploadSignResponse.setUrl(url); 
        dubboImgUploadSignResponse.setCode(0); 
        
		return dubboImgUploadSignResponse;
	}
	
}
