package com.dexter.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dexter.core.HelloService;
import com.dexter.model.User;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
 
 @Autowired
 HelloService helloService;

 @RequestMapping(value = "/", method = RequestMethod.GET)
 public String home(Model model) {
	 model.addAttribute("msg",helloService.helloServiceTest());
	 model.addAttribute("user",new User());
  return "home";
 }
 
 @RequestMapping(value = "/addUser", method = RequestMethod.POST)
 public String serviceTest(@ModelAttribute User user, Model model) {
	 if(null==user) {
		 model.addAttribute("msg","No user received");
		 return "home";
	 }
	 if(StringUtils.isEmpty(user.getName())) {
		 model.addAttribute("msg","Enter Name");
		 return "home";
	 }
	 if(user.getAge()<10) {
		 model.addAttribute("msg","Age cannot be < 10");
		 return "home";
	 }
	 model.addAttribute("msg","Welcome "+user.getName()+"("+user.getAge()+")");
	 return "home";
 }
 
}