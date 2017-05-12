package com.niit.modeldao;

import java.util.List;

import com.niit.modeldto.Product;
import com.niit.modeldto.User;

public interface Productdao 
{
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int proid);
	public Product getProductByProductName(String proname);
	public List<Product> displayAll();

}
