package com.noetic.marshalling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noetic.marshalling.client.TokenWsdlServiceAdapter;
import com.noetic.marshalling.dto.TokenDTO;
import com.noetic.marshalling.generated.GetToken;
import com.noetic.marshalling.generated.GetTokenResponse;
import com.noetic.marshalling.generated.ObjectFactory;
import com.noetic.marshalling.generated.Web2PayResultToken;


@RestController
@RequestMapping("api/v1/tokens")
public class TokenWsdlController {

    @Autowired
    private TokenWsdlServiceAdapter tokenWsdlServiceAdapter;

    @PostMapping
    public Web2PayResultToken getToken(@RequestBody TokenDTO tokenDTO){
        ObjectFactory objectFactory = new ObjectFactory();
        
        GetToken type = new GetToken();

        type.setEMerchantID(tokenDTO.geteMerchantID());
        type.setMerchantRef(tokenDTO.getMerchantRef());
        type.setOptionFlags(tokenDTO.getOptionFlags());
        type.setTokenNo(tokenDTO.getTokenNo());
        type.setValidationCode(tokenDTO.getValidationCode());
        
        GetTokenResponse response =  tokenWsdlServiceAdapter.getToken(">>>soapUrl eg :- end with asmx<<<", type);//to get this one"
           		//"use soap ui IDE and upload the xsd into it,then create a sample request<<<"
        return response.getGetTokenResult();
    }
}