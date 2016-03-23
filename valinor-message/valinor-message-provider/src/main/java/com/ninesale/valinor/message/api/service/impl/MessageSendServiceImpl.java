package com.ninesale.valinor.message.api.service.impl;


import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ninesale.valinor.message.api.model.request.DubboAddMessageRecordRequest;
import com.ninesale.valinor.message.api.model.response.DubboAddMessageRecordResponse;
import com.ninesale.valinor.message.api.service.MessageSendService;
import com.ninesale.valinor.message.provider.dao.MessageRecordMapper;
import com.ninesale.valinor.message.provider.model.DtoMessageRecord;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;

/**
 * 发送短信服务实现类
 * 创建人：Zhoup   
 * 创建时间：2015年10月31日10:41:56
 */
public class MessageSendServiceImpl implements MessageSendService{
	
	private static final Logger logger = Logger.getLogger(MessageSendService.class);
	
	@Resource
	private MessageRecordMapper messageRecordMapper;
	
	@Override
	public DubboAddMessageRecordResponse insert(DubboAddMessageRecordRequest dubboAddMessageRecordRequest){
		logger.info("***start***MessageSendServiceImpl.insert***start***"); 
		logger.info(dubboAddMessageRecordRequest.toString()); 
		DubboAddMessageRecordResponse dubboAddMessageRecordResponse = new DubboAddMessageRecordResponse();
		DtoMessageRecord messageRecord = BeanMapper.map(dubboAddMessageRecordRequest, DtoMessageRecord.class);
		logger.info(messageRecord.toString());
		int icount=0;
		try {
			icount = messageRecordMapper.insert(messageRecord);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"保存短信发送记录异常");
		}
		
		dubboAddMessageRecordResponse.setResultCode(0);
		dubboAddMessageRecordResponse.setIcount(icount);
		logger.info(dubboAddMessageRecordResponse.toString());
		logger.info("***end***MessageSendServiceImpl.insert***end***");
		return dubboAddMessageRecordResponse;
	}
}
