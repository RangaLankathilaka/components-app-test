package com.noetic.pos.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.noetic.pos.domain.Customer;
import com.noetic.pos.domain.repository.CustomerRepository;
import com.noetic.pos.dto.CustomerDTO;
import com.noetic.pos.exception.CustomerException;
import com.noetic.pos.exception.TransformerException;
import com.noetic.pos.transformer.CustomerTransformer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	CustomerTransformer customerTransformer;

	private static final String CUSTOMER_NOT_FOUND = "Customer not found";
	private static final String ERROR_OCCURED = "Error occured: {} ";

	public CustomerDTO createCustomer(CustomerDTO customerDTO) throws CustomerException, TransformerException {
		Customer customer = null;
		if (customerDTO == null) {
			throw new CustomerException("Customer is empty");
		} else {
			customer = customerRepository.save(customerTransformer.transformDTOToDomain(customerDTO));
			customerDTO = customerTransformer.transformDomainToDTO(customer);
		}

		return customerDTO;
	}

	public CustomerDTO readCustomer(String id) throws CustomerException, TransformerException {
		Customer customer = customerRepository.findOne(id);
		if (customer == null) {
			throw new CustomerException(CUSTOMER_NOT_FOUND);
		} else {
			return customerTransformer.transformDomainToDTO(customer);
		}
	}

	public List<CustomerDTO> readCustomerAll(int page, int size) throws CustomerException {

		Page<Customer> customerList = null;
		List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();
		CustomerDTO customerDTO = null;
		Pageable pageRequest = createPageRequest(page, size);

		try {
			customerList = customerRepository.findAll(pageRequest);

			if (customerList == null) {
				throw new CustomerException("Customer List not found.");
			} else {

				for (Customer customer : customerList) {

					customerDTO = customerTransformer.transformDomainToDTO(customer);
					customerDTOList.add(customerDTO);
				}
			}
		} catch (TransformerException e) {
			LOGGER.error(ERROR_OCCURED, e.getMessage());
		}
		return customerDTOList;
	}

	public CustomerDTO updateCustomer(CustomerDTO customerDTO) throws CustomerException, TransformerException {

		Customer customer = customerRepository.findOne(customerDTO.getCustomerId());
		if (customer == null) {
			throw new CustomerException(CUSTOMER_NOT_FOUND);
		} else {
			customer = customerRepository.save(customerTransformer.transformDTOToDomain(customerDTO));
			customerDTO = customerTransformer.transformDomainToDTO(customer);
		}

		return customerDTO;
	}

	public void deleteCustomer(String id) throws CustomerException {
		Customer customer = customerRepository.findOne(id);

		if (customer == null) {
			throw new CustomerException("Customer not found for the given id.");
		} else {
			customerRepository.delete(id);
		}
	}

	private Pageable createPageRequest(int page, int size) {
		return new PageRequest(page, size);
	}

}
