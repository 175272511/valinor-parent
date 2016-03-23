package com.ninesale.valinor.image.api.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.ninesale.valinor.image.api.model.dto.DubboImg;
import com.ninesale.valinor.image.api.model.dto.DubboImgResInfo;
import com.ninesale.valinor.image.api.model.dto.DubboImgRespInfo;
import com.ninesale.valinor.image.api.model.dto.DubboImgTag;
import com.ninesale.valinor.image.api.model.dto.DubboImgTagAndType;
import com.ninesale.valinor.image.api.model.dto.DubboImgTagGroup;
import com.ninesale.valinor.image.api.model.dto.DubboImgTagGroupRespInfo;
import com.ninesale.valinor.image.api.model.dto.DubboImgTagType;
import com.ninesale.valinor.image.api.model.request.DubboInsertUpdateImgRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTagRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryTagRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryTagTypeRequest;
import com.ninesale.valinor.image.api.model.response.DubboInsertUpdateImgResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTagResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryTagResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryTagTypeResponse;
import com.ninesale.valinor.image.api.service.DubboImgService;
import com.ninesale.valinor.image.provider.model.DtoImgStore;
import com.ninesale.valinor.image.provider.model.DtoImgStoreTypeLocation;
import com.ninesale.valinor.image.provider.model.DtoImgTag;
import com.ninesale.valinor.image.provider.model.DtoImgTagAndType;
import com.ninesale.valinor.image.provider.model.DtoImgTagLocation;
import com.ninesale.valinor.image.provider.model.DtoImgTagType;
import com.ninesale.valinor.image.provider.service.ImgStoreService;
import com.ninesale.valinor.image.provider.service.ImgTagService;
import com.ninesale.valinor.image.provider.service.ImgTagGroupService;
import com.ninesale.valinor.image.provider.service.ImgTagTypeService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

public class DubboImgServiceImpl implements DubboImgService {

	private static final Logger logger = Logger.getLogger(DubboImgServiceImpl.class);

	@Resource
	private ImgStoreService imgStoreService;

	@Resource
	private ImgTagService imgTagService;

	@Resource
	private ImgTagTypeService imgTagTypeService;

	@Resource
	private ImgTagGroupService imgTagGroupService;

	@Override
	public DubboInsertUpdateImgResponse insertUpdateImgAndTag(DubboInsertUpdateImgRequest request) {
		logger.info("DubboInsertUpdateImgTagRequest==" + request != null ? request.toString() : "null");
		DubboInsertUpdateImgResponse reponse = new DubboInsertUpdateImgResponse();

		if (null == request || CollectionUtils.isEmpty(request.getImgList())) {
			reponse.setCode(4);
			reponse.setDesc("参数不正确");
			return reponse;
		}
		//方法返回结果集合
		List<DubboImgResInfo> addImgReslist = new ArrayList<DubboImgResInfo>();
		
		try {
			//待新增的标签位置VO集合
			List<DtoImgTagLocation> initInsertImgTagGroupList = new ArrayList<DtoImgTagLocation>();
			DtoImgStore imgStore = null;
			
			List<DubboImg> imgList = request.getImgList();
			for (DubboImg dubboImgVO : imgList) { 
				// 查询图片信息
				imgStore = new DtoImgStore();
				imgStore.setFileId(dubboImgVO.getFileId());
				List<DtoImgStore> imgStoreList = imgStoreService.queryImgStoreList(imgStore);
				
				if (CollectionUtils.isNotEmpty(imgStoreList)) {
					// 图片存在,更新图片描述
					imgStore = new DtoImgStore();
					imgStore.setImageText(dubboImgVO.getImageText());
					imgStore.setUpdateTime(new Date());
					imgStore.setId(imgStoreList.get(0).getId());
					imgStoreService.updateByPrimaryKeySelective(imgStore);
					
					// 将更新图片ID和文件ID返回
					initAddImgResList(addImgReslist, imgStoreList.get(0).getId(),dubboImgVO.getFileId());
					
					if (CollectionUtils.isNotEmpty(dubboImgVO.getImgTagGroupList())) {
						// 保存标签和初始化待保存的图片标签组合信息
						initImgTagLocationAndInsertImgTag(initInsertImgTagGroupList, dubboImgVO.getImgTagGroupList(), imgStoreList.get(0).getId());
						// 通过图片ID删除关联图片标签组合信息
						imgTagGroupService.deleteImgTagLocationByImgid(imgStoreList.get(0).getId());
					}

				}else {
					// 图片不存在,保存图片信息
					imgStore = BeanMapper.map(dubboImgVO, DtoImgStore.class);
					imgStore.setCreateTime(new Date());
					imgStore.setUpdateTime(new Date());
					Map<String, Object> imgAddMap = imgStoreService.insert(imgStore);
					
					// 将新增图片ID和文件ID返回
					initAddImgResList(addImgReslist, (Long) imgAddMap.get("id"),dubboImgVO.getFileId());
					
					if (CollectionUtils.isNotEmpty(dubboImgVO.getImgTagGroupList())) {
						// 保存标签和初始化待保存的图片标签组合信息
						initImgTagLocationAndInsertImgTag(initInsertImgTagGroupList, dubboImgVO.getImgTagGroupList(), (Long) imgAddMap.get("id"));
					}

				}

				// 新增图片标签组合信息
				if (CollectionUtils.isNotEmpty(initInsertImgTagGroupList)) {
					for (DtoImgTagLocation imgTagLocation : initInsertImgTagGroupList) {
						imgTagGroupService.insert(imgTagLocation);
					}
				}
				initInsertImgTagGroupList = new ArrayList<DtoImgTagLocation>();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存图片和标签相关信息异常");
		}

		reponse.setAddImgReslist(addImgReslist);
		reponse.setCode(0);
		return reponse;
	}

	@Override
	public DubboQueryImgTagResponse queryImgList(DubboQueryImgTagRequest request) {
		logger.info("DubboQueryTagRequest==" + request != null ? request.toString() : "null");
		DubboQueryImgTagResponse response = new DubboQueryImgTagResponse();
		if (null == request || CollectionUtils.isEmpty(request.getImgIdList())) {
			response.setCode(4);
			response.setDesc("参数不正确");
			return response;
		}

		try {
			List<DtoImgStoreTypeLocation> imgList = imgStoreService.queryImgLocationList(request.getImgIdList());
			if (CollectionUtils.isNotEmpty(imgList)) {
				for (DtoImgStoreTypeLocation imgVO : imgList) { 
					if (CollectionUtils.isNotEmpty(imgVO.getImgTagGroupList())) { 
						for (DtoImgTagLocation imgTagGroupVO : imgVO.getImgTagGroupList()) {
							imgTagGroupVO.setImgTagIdList(JSON.parseArray(imgTagGroupVO.getImgTagIdListStr(), Long.class));
							imgTagGroupVO.setImgTagNameList(JSON.parseArray(imgTagGroupVO.getImgTagNameListStr(), String.class));
						}
					}
				}
 
				List<DubboImgRespInfo> dubboImgList = BeanMapper.map(imgList, DubboImgRespInfo.class);
				response.setImgList(dubboImgList); 
				// 循环图片
				for (DubboImgRespInfo dubboImgVO : response.getImgList()) { 
					if (CollectionUtils.isNotEmpty(dubboImgVO.getImgTagGroupList())) {
						// 循环图片标签组合,通过标签ID集合获取标签List
						for (DubboImgTagGroupRespInfo dubboImgTagGroupVO : dubboImgVO.getImgTagGroupList()) {
							if (CollectionUtils.isNotEmpty(dubboImgTagGroupVO.getImgTagIdList())) {
								// 标签ID集合查询图片标签List
								List<DtoImgTagAndType> imgTagList = imgTagService.queryImgTagAndTypeList(dubboImgTagGroupVO.getImgTagIdList());
								if (CollectionUtils.isNotEmpty(imgTagList)) {
									List<DubboImgTagAndType> dubboImgTaglist = BeanMapper.map(imgTagList, DubboImgTagAndType.class);
									dubboImgTagGroupVO.setImgTagAndTypeList(dubboImgTaglist);
								}
							}
						} 
					}
				}
			}

		}
		catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询图片和图片标签相关信息异常");
		}
		logger.info(response.toString());
		logger.info("***end***DubboImgServiceImpl.queryImgLocalTagList***end***");
		response.setCode(0);
		return response;
	}

	@Override
	public DubboQueryTagResponse queryTagList(DubboQueryTagRequest request) {
		logger.info("DubboQueryTagRequest==" + request != null ? request.toString() : "null");
		DubboQueryTagResponse response = new DubboQueryTagResponse();
		List<DtoImgTag> list = null;
		try {
			DtoImgTag queryImgTagReq = BeanMapper.map(request, DtoImgTag.class);
			list = imgTagService.queryImgTagList(queryImgTagReq);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询图片标签列表异常");
		}

		if (CollectionUtils.isNotEmpty(list)) {
			List<DubboImgTag> resultlist = BeanMapper.map(list, DubboImgTag.class);
			response.setImgTag(resultlist);
		}

		response.setCode(0);
		logger.info(response.toString());
		logger.info("***end***DubboImgServiceImpl.queryTagList***end***");

		return response;
	}

	@Override
	public DubboQueryTagTypeResponse queryTagTypeList(DubboQueryTagTypeRequest request) {
		logger.info("DubboQueryTagTypeRequest==" + request != null ? request.toString() : "null");
		DubboQueryTagTypeResponse response = new DubboQueryTagTypeResponse();
		List<DtoImgTagType> list = null;
		try {
			DtoImgTagType queryImgTagReq = BeanMapper.map(request, DtoImgTagType.class);
			list = imgTagTypeService.queryImgTagTypeList(queryImgTagReq);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询图片标签类型列表异常");
		}

		if (list != null && list.size() > 0) {
			List<DubboImgTagType> resultlist = BeanMapper.map(list, DubboImgTagType.class);
			response.setImgTagTypeList(resultlist);
		}

		response.setCode(0);
		logger.info(response.toString());
		logger.info("***end***DubboImgServiceImpl.queryTagTypeList***end***");

		return response;
	}

	private void initImgTagLocationAndInsertImgTag(List<DtoImgTagLocation> insertDtoTagLocationList, List<DubboImgTagGroup> imgTagInfoList, Long imgId) {
		for (DubboImgTagGroup imgTagLocaVO : imgTagInfoList) {
			// 初始化待保存的标签位置集合信息和保存标签信息
			DtoImgTagLocation dtoImgTagLocation = BeanMapper.map(imgTagLocaVO, DtoImgTagLocation.class);
			List<String> imgTagNameList = imgTagLocaVO.getImgTagNameList();
			List<Long> imgTagIdList = new ArrayList<Long>();
			DtoImgTag addImgTag = null;
			for (int i = 0; i < imgTagNameList.size(); i++) {
				if (StringUtils.isNotBlank(imgTagNameList.get(i))) {
					addImgTag = imgTagService.queryImgTag(new Long(i), imgTagNameList.get(i));
					if(null == addImgTag){
						addImgTag = new DtoImgTag();
						addImgTag.setCreateTime(new Date()); 
						addImgTag.setUpdateTime(new Date());
						addImgTag.setTagTypeId(new Long(i));
						addImgTag.setTagName(imgTagNameList.get(i));
						// 新增标签
						Map<String, Object> map = imgTagService.insert(addImgTag);
						imgTagIdList.add((Long) map.get("id"));
					}else{
						imgTagIdList.add(addImgTag.getId());
					}
				}else{
					imgTagIdList.add(0L);
				}
			}
			
			dtoImgTagLocation.setImgTagIdListStr(JSON.toJSONString(imgTagIdList));
			dtoImgTagLocation.setImgTagNameListStr(JSON.toJSONString(imgTagNameList));
			dtoImgTagLocation.setImgId(imgId);
			dtoImgTagLocation.setCreateTime(new Date());
			dtoImgTagLocation.setUpdateTime(new Date());

			insertDtoTagLocationList.add(dtoImgTagLocation);
		}
	}
	
	private void initAddImgResList(List<DubboImgResInfo> addImgReslist,Long imgId, String fileId) {
		DubboImgResInfo imgResInfo= new DubboImgResInfo();
		imgResInfo.setImgId(imgId);
		imgResInfo.setFileId(fileId);
		addImgReslist.add(imgResInfo);
	}

}
