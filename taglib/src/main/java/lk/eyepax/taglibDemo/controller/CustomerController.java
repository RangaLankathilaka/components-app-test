package lk.eyepax.taglibDemo.controller;

import lk.eyepax.taglibDemo.dto.CustomerDTO;
import lk.eyepax.taglibDemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/index")
public class CustomerController {

	
	private CustomerService userService;
	

	@Autowired
	public void setUserService(CustomerService userService) {
		this.userService = userService;
	}
	

	@RequestMapping(value="", method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        model.addObject("list", userService.listAllUsers());
		System.out.println(userService.listAllUsers());
        return model;
    }
	

	   @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	    public ModelAndView deleteUsers(@PathVariable long id) {
		   	userService.deleteUser(id);
	        return new ModelAndView("redirect:/index");
	    }


	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ModelAndView userRegister(@ModelAttribute("user") CustomerDTO user){
		ModelAndView model = new ModelAndView("index");
		if(user!=null){
			userService.saveUser(user);
			model.addObject("warning", "CustomerDTO Registration Success");

		}
		else{
			model.addObject("danger","Something Going Bad" );

		}
		return new ModelAndView("redirect:/index");
	}
    	  @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    	    public ModelAndView edit(@PathVariable("id") long id) {
    		  ModelAndView model = new ModelAndView("edit");
    	        CustomerDTO customer = userService.getUserById(id);
    	        model.addObject("customer", customer);
    	        return model;
    	    }

    	   @RequestMapping(value = "/update", method = RequestMethod.POST)
    	    public ModelAndView update(@RequestParam("id") long id,
    	                               @RequestParam("name") String name,@RequestParam("address") String address,
    	    						   @RequestParam("contact") String contact) {
    	        CustomerDTO customer = userService.getUserById(id);
			   customer.setName(name);
			   customer.setAddress(address);
			   customer.setContact(contact);
    	        userService.saveUser(customer);
    	        return new ModelAndView("redirect:/index");
    	    }
   
}
