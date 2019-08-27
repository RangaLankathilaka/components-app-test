package com.noetic.marshalling.client;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.noetic.marshalling.generated.GetTokenResponse;

public class TokenWsdlServiceAdapter extends WebServiceGatewaySupport {

	public GetTokenResponse getToken(String url, Object request){

		
		WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
		GetTokenResponse res = null;
	       try {

	           res = (GetTokenResponse) getWebServiceTemplate().marshalSendAndReceive(url, request, new SoapActionCallback("http://web2pay.com/5.0/2009/11/5.1.0/GetToken"));

	       }catch(SoapFaultClientException ex){
	           logger.error(ex.getMessage());
	       }

	           return res;
	       }
	
}