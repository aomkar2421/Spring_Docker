package com.om.service;

import java.util.List;

import com.om.Entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	
	public Product editProduct(Product product, Integer id);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(Integer id);
	
	public String deleteProduct(Integer id);
	
	
}
