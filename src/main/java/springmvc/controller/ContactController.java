package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import springmvc.model.User1;
import springmvc.service.Userservice;

@Controller
public class ContactController 
{
	//@Autowired
	//private Userservice userservice;
	@RequestMapping("/contact")
public String showform()
{
	return "contact";
}
/*
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String  handleform(@RequestParam("email") String email,@RequestParam("name") String name
	,Model model)
	{
		model.addAttribute("email",email);
		return "success";
		
	}*/
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleform(@ModelAttribute  User1 user1, Model model )
	{
		//this.userservice.createuser(user1);
		return "success";
		
	}
		
		
	}
	
