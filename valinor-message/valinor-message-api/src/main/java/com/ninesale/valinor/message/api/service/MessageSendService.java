package com.ninesale.valinor.message.api.service;

import com.ninesale.valinor.message.api.model.request.DubboAddMessageRecordRequest;
import com.ninesale.valinor.message.api.model.response.DubboAddMessageRecordResponse;

/**
 * 发送短信接口
 * 创建人：Zhoup   
 * 创建时间：2015年10月31日10:33:35
 */
public interface MessageSendService {
	/**
	 * 添加短信发送记录
	 * @param request 短信发送记录信息
	 * @return DubboAddMessageRecordResponse
	 */
	public DubboAddMessageRecordResponse insert(DubboAddMessageRecordRequest dubboAddImgStoreRequest);
}
