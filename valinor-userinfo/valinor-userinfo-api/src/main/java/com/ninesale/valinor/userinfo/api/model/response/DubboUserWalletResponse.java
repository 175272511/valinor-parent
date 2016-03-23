/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import com.ninesale.valinor.userinfo.api.model.DtoUserWallet;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboUserWalletResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1858064401521949713L;

	private DtoUserWallet data;

	public DtoUserWallet getData() {
		return data;
	}

	public void setData(DtoUserWallet data) {
		this.data = data;
	}
	
	
}
