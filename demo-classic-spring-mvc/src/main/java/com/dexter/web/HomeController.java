package com.dexter.web;

import com.dexter.core.UserValidator;
import com.dexter.core.HelloService;
import com.dexter.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

private final HelloService helloService;
private final UserValidator userValidator;

public HomeController(HelloService helloService, UserValidator userValidator) {
	this.helloService = helloService;
	this.userValidator = userValidator;
}

@RequestMapping(value = "/", method = RequestMethod.GET)
public String home(Model model) {
	log.debug("Invoked home method");
	model.addAttribute("msg",helloService.helloServiceTest());
	User user =  new User();
	user.setDoj(LocalDate.now());
	model.addAttribute("user",user);
	return "home";
}
 
 @RequestMapping(value = "/addUser", method = RequestMethod.POST)
 public String serviceTest(@ModelAttribute User user,
						   BindingResult bindingResult,
						   Model model) {
	 log.debug("Invoked serviceTest method");
	 userValidator.validate(user,bindingResult);
	 if(bindingResult.hasErrors()){
		 log.error("has {} error(s)",bindingResult.getErrorCount());
		 return "home";
	 }
	 user.setUpdatedOn(LocalDateTime.now());
	 log.debug("Validated model successfully {}",user.toString());
	 model.addAttribute("user",new User());
	 model.addAttribute("msg",String.format("User %s (%s) updated on %s",
			 user.getName(),
			 user.getAge(),
			 user.getUpdatedOn()
	 ));
	 return "home";
 }
 
}