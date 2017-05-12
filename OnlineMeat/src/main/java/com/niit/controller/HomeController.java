package com.niit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	@RequestMapping({"/Home","/"})
	public String goToHomePage()
	{
		return "Home";
	}
	@RequestMapping("/AboutUs")
	public String aboutuspage()
	{
		return "AboutUs";
	}	
	/*@RequestMapping("/Product")
	public String productpage()
	{
		return "Product";
	}
	
	@RequestMapping("/Category")
	public String categorypage()
	{
		return "Category";
	}*/
}
