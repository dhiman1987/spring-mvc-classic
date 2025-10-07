package com.dexter.web;

import com.dexter.core.HelloService;
import com.dexter.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

public HomeController(HelloService helloService) {
	this.helloService = helloService;
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
 public String serviceTest(@ModelAttribute User user, Model model) {
	 log.debug("Invoked serviceTest method");
	 if(null==user.getName() || user.getName().trim().isEmpty()) {
		 model.addAttribute("error","Enter Name");
		 log.error("Name is blank");
		 return "home";
	 }
	 if(user.getAge()<10) {
		 model.addAttribute("error","Age cannot be < 10");
		 log.error("Age {} cannot be < 10",user.getAge());
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