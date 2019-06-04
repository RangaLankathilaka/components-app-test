package com.noetic.pos.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.noetic.pos.dto.CustomerDTO;
import com.noetic.pos.dto.common.ResponseDTO;



@RequestMapping(value = "/internal/upa", produces = "application/json; charset=UTF-8", consumes = "application/json")
public interface CustomerResoure {
	// Customer Crud Endpoints
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public ResponseDTO<?> saveCustomer(@RequestBody CustomerDTO customerDTO);

	// ==============================================================================================

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public ResponseDTO<?> readCustomer(@RequestParam String id);

	// ==============================================================================================

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ResponseDTO<?> readCustomerAll(@RequestParam("page") int page, @RequestParam("size") int size);

	// ==============================================================================================

	@RequestMapping(value = "/customer", method = RequestMethod.PUT)
	public ResponseDTO<?> updateCustomer(@RequestBody CustomerDTO customerDTO);

	// ==============================================================================================

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
	public ResponseDTO<?> deleteCustomer(@PathVariable String id);

	// ==============================================================================================

}
