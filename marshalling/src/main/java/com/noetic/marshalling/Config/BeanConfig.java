package com.noetic.marshalling.Config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.noetic.marshalling.client.TokenWsdlServiceAdapter;




@Configuration
public class BeanConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.noetic.marshalling.generated");
		return marshaller;
	}

	@Bean
	public TokenWsdlServiceAdapter soapConnector(Jaxb2Marshaller marshaller) {
		TokenWsdlServiceAdapter client = new TokenWsdlServiceAdapter();
		client.setDefaultUri(">>>soapUrl eg :- end with asmx<<<");//to get this one"
           		// "use soap ui IDE and upload the xsd into it,then create a sample request<<<"
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
}
