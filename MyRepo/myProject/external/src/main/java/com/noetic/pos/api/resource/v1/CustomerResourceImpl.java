package com.noetic.pos.api.resource.v1;

import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.noetic.pos.api.config.DeployProfileConfig;
import com.noetic.pos.api.config.DeployProfileConfigFactory;
import com.noetic.pos.api.util.StreamToString;
import com.noetic.pos.dto.CustomerDTO;
import com.noetic.pos.dto.common.BaseResponseDTO;
import com.noetic.pos.dto.common.MessageDTO;
import com.noetic.pos.dto.common.ResponseDTO;
import com.noetic.pos.dto.common.enums.ResultStatus;

@RestController(value = "UPAResourceCustomerResourceImplV1")
public class CustomerResourceImpl implements CustomerResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerResourceImpl.class);
	private HttpClient httpClient = HttpClientBuilder.create().build();
	private ObjectMapper mapper = new ObjectMapper().configure(JsonParser.Feature.ALLOW_COMMENTS, true);

	@Value("${default.base.endpoint}")
	private String baseURL;

	private static final String UTF_8 = "UTF-8";
	private static final String REQUEST_URL = "RequestURL: {}";
	private static final String REQUEST_FOR_FETCHING_RECORDS = "Request for fetching records : {}";
	private static final String RESPONSE_FOR_FETCHING_RECORDS = "Response for fetching records : {}";
	private static final String CONTENT_TYPE = "Content-Type";
	private static final String APPLICATION_JASON = "application/json";
	private static final String CONNECTION = "Connection";
	private static final String KEEP_ALIVE = "keep-alive";

	@SuppressWarnings("unchecked")
	public ResponseDTO<?> createCustomer(@RequestBody CustomerDTO customerDTO, 
			HttpServletResponse httpServletResponse) {

		ResponseDTO<BaseResponseDTO> response = new ResponseDTO<BaseResponseDTO>();
		response.setResultStatus(ResultStatus.AWATING);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		try {
			DeployProfileConfig deployProfileConfig = DeployProfileConfigFactory.forEnvironment();

			baseURL = deployProfileConfig.getInternalBaseUrl();

			StringBuilder stringRequest = new StringBuilder(baseURL + "/internal/upa/customer");

			HttpPost httpRequest = new HttpPost(stringRequest.toString());
			LOGGER.info(REQUEST_URL, stringRequest);

			httpRequest.setHeader(CONTENT_TYPE, APPLICATION_JASON);
			httpRequest.setHeader(CONNECTION, KEEP_ALIVE);

			updateAuthorization(deployProfileConfig, httpRequest);

			String jsonString = mapper.writeValueAsString(customerDTO);
			LOGGER.info(REQUEST_FOR_FETCHING_RECORDS, jsonString);
			httpRequest.setEntity(new StringEntity(jsonString, UTF_8));

			HttpResponse httpResponse = httpClient.execute(httpRequest);

			jsonString = StreamToString.convertStreamToString(httpResponse.getEntity().getContent());

			LOGGER.info(RESPONSE_FOR_FETCHING_RECORDS, jsonString);

			response = mapper.readValue(jsonString, ResponseDTO.class);

		} catch (Exception e) {
			updateResponse(response, customerDTO.toString(), e);

			response.setHttpCode(response.getHttpStatus() != null ? response.getHttpStatus().toString()
					: HttpStatus.INTERNAL_SERVER_ERROR.toString());
			response.setMessage(new MessageDTO(e.getMessage()));
		} finally {
			httpServletResponse.setStatus(response.getHttpStatus().value());
		}

		return response;

	}

	@SuppressWarnings("unchecked")

	public ResponseDTO<?> readCustomer(@RequestParam String id, HttpServletResponse httpServletResponse) {

		ResponseDTO<BaseResponseDTO> response = new ResponseDTO<BaseResponseDTO>();
		response.setResultStatus(ResultStatus.AWATING);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = "";

		try {
			DeployProfileConfig deployProfileConfig = DeployProfileConfigFactory.forEnvironment();

			baseURL = deployProfileConfig.getInternalBaseUrl();

			StringBuilder stringRequest = new StringBuilder(baseURL + "/internal/upa/customer?id=" + id);

			HttpGet httpRequest = new HttpGet(stringRequest.toString());
			LOGGER.info(REQUEST_URL, stringRequest);

			httpRequest.setHeader(CONTENT_TYPE, APPLICATION_JASON);
			httpRequest.setHeader(CONNECTION, KEEP_ALIVE);

			updateAuthorization(deployProfileConfig, httpRequest);

			HttpResponse httpResponse = httpClient.execute(httpRequest);

			jsonString = StreamToString.convertStreamToString(httpResponse.getEntity().getContent());

			LOGGER.info(RESPONSE_FOR_FETCHING_RECORDS, jsonString);

			response = mapper.readValue(jsonString, ResponseDTO.class);

		} catch (Exception e) {
			updateResponse(response, jsonString, e);

			response.setHttpCode(response.getHttpStatus() != null ? response.getHttpStatus().toString()
					: HttpStatus.INTERNAL_SERVER_ERROR.toString());
			response.setMessage(new MessageDTO(e.getMessage()));
		} finally {
			httpServletResponse.setStatus(response.getHttpStatus().value());
		}

		return response;

	}

	@SuppressWarnings("unchecked")
	public ResponseDTO<?> readCustomerList(int page, int size, HttpServletResponse httpServletResponse) {
		 ResponseDTO<BaseResponseDTO> response = new ResponseDTO<BaseResponseDTO>();
	        response.setResultStatus(ResultStatus.AWATING);
	        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	        String jsonString = "";

	        try {
	            DeployProfileConfig deployProfileConfig = DeployProfileConfigFactory.forEnvironment();

	            baseURL = deployProfileConfig.getInternalBaseUrl();

	            StringBuilder stringRequest = new StringBuilder(
	                    baseURL + "/internal/upa/customers?page=" + page + "&size=" + size);

	            HttpGet httpRequest = new HttpGet(stringRequest.toString());
	            LOGGER.info(REQUEST_URL, stringRequest);

	            httpRequest.setHeader(CONTENT_TYPE, APPLICATION_JASON);
	            httpRequest.setHeader(CONNECTION, KEEP_ALIVE);

	            updateAuthorization(deployProfileConfig, httpRequest);

	            HttpResponse httpResponse = httpClient.execute(httpRequest);

	            jsonString = StreamToString.convertStreamToString(httpResponse.getEntity().getContent());

	            LOGGER.info(RESPONSE_FOR_FETCHING_RECORDS, jsonString);

	            response = mapper.readValue(jsonString, ResponseDTO.class);

	        } catch (Exception e) {
	            updateResponse(response, jsonString, e);

	            response.setHttpCode(response.getHttpStatus() != null ? response.getHttpStatus().toString()
	                    : HttpStatus.INTERNAL_SERVER_ERROR.toString());
	            response.setMessage(new MessageDTO(e.getMessage()));
	        } finally {
	            httpServletResponse.setStatus(response.getHttpStatus().value());
	        }

	        return response;

	}

	@SuppressWarnings("unchecked")
	public ResponseDTO<?> updateCustomer(@RequestBody CustomerDTO customerDTO, 
			HttpServletResponse httpServletResponse) {
		 ResponseDTO<BaseResponseDTO> response = new ResponseDTO<BaseResponseDTO>();
	        response.setResultStatus(ResultStatus.AWATING);
	        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	        try {
	            DeployProfileConfig deployProfileConfig = DeployProfileConfigFactory.forEnvironment();

	            baseURL = deployProfileConfig.getInternalBaseUrl();

	            StringBuilder stringRequest = new StringBuilder(baseURL + "/internal/upa/customer");

	            HttpPut httpRequest = new HttpPut(stringRequest.toString());
	            LOGGER.info(REQUEST_URL, stringRequest);

	            httpRequest.setHeader(CONTENT_TYPE, APPLICATION_JASON);
	            httpRequest.setHeader(CONNECTION, KEEP_ALIVE);

	            updateAuthorization(deployProfileConfig, httpRequest);
	            String jsonString = mapper.writeValueAsString(customerDTO);
	            LOGGER.info(REQUEST_FOR_FETCHING_RECORDS, jsonString);
	            httpRequest.setEntity(new StringEntity(jsonString, UTF_8));

	            HttpResponse httpResponse = httpClient.execute(httpRequest);

	            jsonString = StreamToString.convertStreamToString(httpResponse.getEntity().getContent());

	            LOGGER.info(RESPONSE_FOR_FETCHING_RECORDS, jsonString);

	            response = mapper.readValue(jsonString, ResponseDTO.class);

	        } catch (Exception e) {
	            updateResponse(response, customerDTO.toString(), e);

	            response.setHttpCode(response.getHttpStatus() != null ? response.getHttpStatus().toString()
	                    : HttpStatus.INTERNAL_SERVER_ERROR.toString());
	            response.setMessage(new MessageDTO(e.getMessage()));
	        } finally {
	            httpServletResponse.setStatus(response.getHttpStatus().value());
	        }

	        return response;

	}

	@SuppressWarnings("unchecked")
	public ResponseDTO<?> deleteCustomer(@PathVariable String id, HttpServletResponse httpServletResponse) {
		 ResponseDTO<BaseResponseDTO> response = new ResponseDTO<BaseResponseDTO>();
	        response.setResultStatus(ResultStatus.AWATING);
	        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	        String jsonString = "";

	        try {
	            DeployProfileConfig deployProfileConfig = DeployProfileConfigFactory.forEnvironment();

	            baseURL = deployProfileConfig.getInternalBaseUrl();

	            StringBuilder stringRequest = new StringBuilder(baseURL + "/internal/upa/customer/" + id);

	            HttpDelete httpRequest = new HttpDelete(stringRequest.toString());
	            LOGGER.info(REQUEST_URL, stringRequest);

	            httpRequest.setHeader(CONTENT_TYPE, APPLICATION_JASON);
	            httpRequest.setHeader(CONNECTION, KEEP_ALIVE);

	            updateAuthorization(deployProfileConfig, httpRequest);

	            HttpResponse httpResponse = httpClient.execute(httpRequest);

	            jsonString = StreamToString.convertStreamToString(httpResponse.getEntity().getContent());

	            LOGGER.info(RESPONSE_FOR_FETCHING_RECORDS, jsonString);

	            response = mapper.readValue(jsonString, ResponseDTO.class);

	        } catch (Exception e) {
	            updateResponse(response, jsonString, e);

	            response.setHttpCode(response.getHttpStatus() != null ? response.getHttpStatus().toString()
	                    : HttpStatus.INTERNAL_SERVER_ERROR.toString());
	            response.setMessage(new MessageDTO(e.getMessage()));
	        } finally {
	            httpServletResponse.setStatus(response.getHttpStatus().value());
	        }

	        return response;

	}

	@SuppressWarnings("unchecked")
	private void updateResponse(ResponseDTO<?> response, String message, Exception e) {
		response.setResultStatus(ResultStatus.FAILED);
		response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		LOGGER.error("Error  {} ,  {}", message, e);
		response.setMessage(new MessageDTO(e.getMessage()));
	}

	/**
	 * Update Request Header with Basic authorisation
	 *
	 * @param deployProfileConfig
	 * @param httpRequest
	 */
	private void updateAuthorization(DeployProfileConfig deployProfileConfig, HttpRequestBase httpRequest) {

		byte[] credentials = Base64.encodeBase64(
	 (deployProfileConfig.getInternalApiUsername() + ":" + deployProfileConfig.getInternalApiPassword())
						.getBytes(StandardCharsets.UTF_8));

		httpRequest.setHeader("Authorization", "Basic " + new String(credentials, StandardCharsets.UTF_8));
	}

}
