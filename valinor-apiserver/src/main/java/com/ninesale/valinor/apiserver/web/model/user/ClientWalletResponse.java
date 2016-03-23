/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.userinfo.api.model.DtoUserWallet;

/**
 * @author liuhui
 * 
 */
public class ClientWalletResponse extends ClientBasicResponse{

	private DtoUserWallet data;

	public DtoUserWallet getData() {
		return data;
	}

	public void setData(DtoUserWallet data) {
		this.data = data;
	}
	
	
}
