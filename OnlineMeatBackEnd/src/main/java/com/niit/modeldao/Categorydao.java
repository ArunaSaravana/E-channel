package com.niit.modeldao;

import java.util.List;

import com.niit.modeldto.Category;
import com.niit.modeldto.Product;
import com.niit.modeldto.User;

public interface Categorydao 
{
	public void addCategory(Category category);
	public void updateCategroy(Category category);
	public void deleteCategory(int catid);
	public Category getCategoryById(int catid);
	public List<Category> displayAll();

}
