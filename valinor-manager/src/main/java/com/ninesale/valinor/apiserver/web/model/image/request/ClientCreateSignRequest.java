package com.ninesale.valinor.apiserver.web.model.image.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientCreateSignRequest extends ClientBasicRequest {
	
}
