/**
 * 
 */
package lk.eyepax.taglibDemo.repository;

import lk.eyepax.taglibDemo.dto.CustomerDTO;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<CustomerDTO, Long> {

}
