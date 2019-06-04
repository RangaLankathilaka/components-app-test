package com.noetic.pos.transformer;

import org.springframework.stereotype.Component;

import com.noetic.pos.domain.Customer;
import com.noetic.pos.dto.CustomerDTO;
import com.noetic.pos.exception.TransformerException;

@Component
public class CustomerTransformer extends AbstractTransformer<Customer, CustomerDTO> {

	@Override
	public CustomerDTO transformDomainToDTO(Customer domain) throws TransformerException {

		CustomerDTO dto = new CustomerDTO();

		dto.setCustomerId(domain.getId());
		dto.setCustomerName(domain.getName());
		dto.setCustomerAddress(domain.getAddress());

		return dto;
	}

	@Override
	public Customer transformDTOToDomain(CustomerDTO dto) throws TransformerException {

		Customer domain = new Customer();

		domain.setId(dto.getCustomerId());
		domain.setName(dto.getCustomerName());
		domain.setAddress(dto.getCustomerAddress());
		return domain;
	}

}
