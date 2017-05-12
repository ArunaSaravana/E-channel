package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.modeldao.Userdao;
import com.niit.modeldto.User;

@Controller
public class UserController 
{
	@Autowired
	Userdao userdao;

	@RequestMapping("/LoginRegister")
	public String getLoginRegisterpage(Model model) 
	{
		model.addAttribute("user", new User());
		return "LoginRegister";

	}

	@RequestMapping(value = "/LoginRegister/user", method = RequestMethod.POST)
	public String addLoginRegisterUser(@ModelAttribute("user") User user) 
	{
		System.out.println("Hai" + user.getCust_name());
		userdao.addUser(user);
		return "LoginRegister";
	}
}