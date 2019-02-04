/**
 * 
 */
package lk.eyepax.taglibDemo.service;


import lk.eyepax.taglibDemo.dto.CustomerDTO;

public interface CustomerService {

	   public Iterable<CustomerDTO> listAllUsers();

	   public CustomerDTO getUserById(long id);

	   public CustomerDTO saveUser(CustomerDTO user);
	    
	   public void deleteUser(long id);
	
}
