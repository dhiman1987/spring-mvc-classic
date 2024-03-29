package com.dexter.web;

import com.dexter.core.HelloService;
import com.dexter.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Handles requests for the application home page.
 */
@Controller
@Slf4j
public class HomeController {
 @Autowired
 HelloService helloService;

 @RequestMapping(value = "/", method = RequestMethod.GET)
 public String home(Model model) {
	 log.debug("Invoked home method");
	 model.addAttribute("msg",helloService.helloServiceTest());
	 model.addAttribute("user",new User());
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
	 log.debug("Validated model successfully {}",user.toString());
	 model.addAttribute("user",new User());
	 model.addAttribute("msg",String.format("Welcome %s (%s)",user.getName(),user.getAge()));
	 return "home";
 }
 
}