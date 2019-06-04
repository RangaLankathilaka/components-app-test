package com.noetic.pos.service;

import java.util.List;

import com.noetic.pos.dto.CustomerDTO;
import com.noetic.pos.exception.CustomerException;
import com.noetic.pos.exception.TransformerException;

public interface CustomerService {

	public CustomerDTO createCustomer(CustomerDTO customerDTO) throws CustomerException, TransformerException;

	public CustomerDTO readCustomer(String id) throws CustomerException, TransformerException;

	public List<CustomerDTO> readCustomerAll(int page, int size) throws CustomerException, TransformerException;

	public CustomerDTO updateCustomer(CustomerDTO customerDTO) throws CustomerException, TransformerException;

	public void deleteCustomer(String id) throws CustomerException;

}
