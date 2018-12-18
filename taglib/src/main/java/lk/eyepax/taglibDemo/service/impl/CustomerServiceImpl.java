/**
 * 
 */
package lk.eyepax.taglibDemo.service.impl;

import lk.eyepax.taglibDemo.dto.CustomerDTO;
import lk.eyepax.taglibDemo.repository.CustomerRepository;
import lk.eyepax.taglibDemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;


	@Autowired
	public void setUserRepo(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	@Override
	public Iterable<CustomerDTO> listAllUsers() {
		return customerRepository.findAll();
	}


	@Override
	public CustomerDTO getUserById(long id) {
		return customerRepository.findOne(id);
	}


	@Override
	public CustomerDTO saveUser(CustomerDTO user) {
		return customerRepository.save(user);
	}


	@Override
	public void deleteUser(long id) {

		 customerRepository.delete(id);

	}


}
