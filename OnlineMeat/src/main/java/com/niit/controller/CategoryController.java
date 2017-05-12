package com.niit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.modeldao.Categorydao;
import com.niit.modeldto.Category;
import com.niit.modeldto.Product;



@Controller
public class CategoryController 
{
	@Autowired
	Categorydao categorydao;
	
	@RequestMapping(value="CategoryAddition",method=RequestMethod.GET)
	public String addCategory(@RequestParam("catid") int catid,@RequestParam("catname") String catname,@RequestParam("catdesc") String catdesc,Model m)
	{	
		Category category=new Category();
		category.setCatid(catid);
		category.setCatname(catname);
		category.setCatdesc(catdesc);
		
		categorydao.addCategory(category);;
		
		List<Category> list=categorydao.displayAll();
		m.addAttribute("catlist",list);
		
		return "Category";
	}
	
	@RequestMapping("Category")
	public String showCategoryPage(Model m)
	{
		List<Category> list=categorydao.displayAll();
		m.addAttribute("catlist",list);		
		return "Category";
	}
	
	@RequestMapping(value="/deleteCategory/{catid}",method=RequestMethod.GET)
	public String deleteCategory(@PathVariable("catid") int catid,Model m)
	{
		categorydao.deleteCategory(catid);
		List<Category> list=categorydao.displayAll();
		m.addAttribute("catlist",list);
		return "Category";
	}
	@RequestMapping(value="updateCategory/{catid}",method=RequestMethod.GET)
	public String readyUpdate(@PathVariable("catid")int catid,Model m)
	{
		Category category=categorydao.getCategoryById(catid);
		m.addAttribute(category);
		
		List<Category> list=categorydao.displayAll();
		m.addAttribute("catlist",list);
		
		return "UpdateCategory";
	}
	
	@RequestMapping(value="UpdateCategory",method=RequestMethod.POST)
	public String updateCategory(@ModelAttribute("category") Category category,Model m)
	{
		categorydao.updateCategroy(category);
		
		Category category1 = new Category();
		m.addAttribute(category1);
		
		List<Category> list=categorydao.displayAll();
		m.addAttribute("catlist",list);
		
		return "redirect:/Category";
	}
	

}
