package com.noetic.pos.resource;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.noetic.pos.dto.CustomerDTO;
import com.noetic.pos.dto.CustomerResponseDTO;
import com.noetic.pos.dto.common.MessageDTO;
import com.noetic.pos.dto.common.ResponseDTO;
import com.noetic.pos.dto.common.enums.ResultStatus;
import com.noetic.pos.exception.CustomerException;
import com.noetic.pos.service.CustomerService;

@RestController
public class CustomerResourceImpl implements CustomerResoure{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerResourceImpl.class);
	
	@Autowired
	private CustomerService customerService;
	
	private static final String ERROR_STRING = "Error requesting {}, error {}";

	public ResponseDTO<?> saveCustomer(@RequestBody CustomerDTO customerDTO) {
		ResponseDTO<CustomerDTO> response = new ResponseDTO<CustomerDTO>();
        response.setResultStatus(ResultStatus.AWATING);
        MessageDTO message = new MessageDTO();

        try {
            response.setPayload(customerService.createCustomer(customerDTO));
            response.setResultStatus(ResultStatus.SUCCESSFUL);
            response.setHttpStatus(HttpStatus.CREATED);

        } catch (Exception e) {
            LOGGER.error(ERROR_STRING, customerDTO, e.getMessage());
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            message.setMessage(e.getMessage());
            response.setMessage(message);
        }

        return response;

	}

	public ResponseDTO<?> readCustomer(@RequestParam String id) {
		ResponseDTO<CustomerDTO> response = new ResponseDTO<CustomerDTO>();
        response.setResultStatus(ResultStatus.AWATING);
		CustomerDTO result = null;
        String message = null;

        try {
            result = customerService.readCustomer(id);
            response.setResultStatus(ResultStatus.SUCCESSFUL);
            response.setHttpStatus(HttpStatus.OK);
            LOGGER.debug("Customer read {}", result);

        } catch (CustomerException tx) {
            LOGGER.error("Customer creating {}, error {}", id, tx.getMessage());
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.BAD_REQUEST);

            message = tx.getMessage();

        } catch (Exception e) {
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            LOGGER.error(ERROR_STRING, id, e.getMessage());
            message = e.getMessage();
        } finally {
            response.setHttpCode(response.getHttpStatus() != null
                    ? response.getHttpStatus().toString() : null);
            MessageDTO messageDTO = new MessageDTO(message);
            response.setMessage(messageDTO);
            response.setPayload(result);
        }

        return response;

	}

	public ResponseDTO<?> readCustomerAll(int page, int size) {
		
		ResponseDTO<CustomerResponseDTO> response = new ResponseDTO<CustomerResponseDTO>();
        response.setResultStatus(ResultStatus.AWATING);
        List<CustomerDTO> result = null;
        CustomerResponseDTO resultList = new CustomerResponseDTO();
        String message = null;

        try {
            result = customerService.readCustomerAll(page, size);
            resultList.setCustomerList(result);
            response.setResultStatus(ResultStatus.SUCCESSFUL);
            response.setHttpStatus(HttpStatus.OK);
            LOGGER.debug(" Customer List read {}", result);

        } catch (CustomerException tx) {
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.BAD_REQUEST);
            LOGGER.error("Customer List reading error {}", tx.getMessage());
            message = tx.getMessage();

        } catch (Exception e) {
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            LOGGER.error(ERROR_STRING, e.getMessage());
            message = e.getMessage();
        } finally {
            response.setHttpCode(response.getHttpStatus() != null
                    ? response.getHttpStatus().toString() : null);
            MessageDTO messageDTO = new MessageDTO(message);
            response.setMessage(messageDTO);
            response.setPayload(resultList);
        }

        return response;

	}

	public ResponseDTO<?> updateCustomer(@RequestBody CustomerDTO customerDTO) {
		ResponseDTO<CustomerDTO> response = new ResponseDTO<CustomerDTO>();
        response.setResultStatus(ResultStatus.AWATING);
        CustomerDTO result = null;
        String message = null;
        try {
            result = customerService.updateCustomer(customerDTO);
            response.setResultStatus(ResultStatus.SUCCESSFUL);
            response.setHttpStatus(HttpStatus.CREATED);
            LOGGER.debug("Customer updated {}", result);

        } catch (CustomerException tx) {
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.BAD_REQUEST);
            LOGGER.error("Customer updating {}, error {}", customerDTO, tx.getMessage());
            message = tx.getMessage();

        } catch (Exception e) {
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            LOGGER.error(ERROR_STRING, customerDTO.toString(), e.getMessage());
            message = e.getMessage();
        } finally {
            response.setHttpCode(response.getHttpStatus() != null
                    ? response.getHttpStatus().toString() : null);
            MessageDTO messageDTO = new MessageDTO(message);
            response.setMessage(messageDTO);
            response.setPayload(result);
        }
        return response;

	}

	public ResponseDTO<?> deleteCustomer(@PathVariable String id) {
		
		ResponseDTO<CustomerDTO> response = new ResponseDTO<CustomerDTO>();
        response.setResultStatus(ResultStatus.AWATING);
        CustomerDTO result = null;
        String message = null;

        try {
        	customerService.deleteCustomer(id);
            response.setResultStatus(ResultStatus.SUCCESSFUL);
            response.setHttpStatus(HttpStatus.OK);
            LOGGER.debug(" Customer deleted");

        } catch (CustomerException tx) {
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.BAD_REQUEST);
            LOGGER.error("Customer delete {}, error {}", id, tx.getMessage());
            message = tx.getMessage();

        } catch (Exception e) {
            response.setResultStatus(ResultStatus.FAILED);
            response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            LOGGER.error(ERROR_STRING, id, e.getMessage());
            message = e.getMessage();
        } finally {
            response.setHttpCode(response.getHttpStatus() != null
                    ? response.getHttpStatus().toString() : null);
            MessageDTO messageDTO = new MessageDTO(message);
            response.setMessage(messageDTO);
            response.setPayload(result);
        }

        return response;

	}

}
