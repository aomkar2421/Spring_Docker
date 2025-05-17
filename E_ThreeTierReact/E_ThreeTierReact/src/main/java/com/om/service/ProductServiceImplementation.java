package com.om.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.om.Entity.Product;
import com.om.repository.ProductRepo;

@Service
public class ProductServiceImplementation implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product editProduct(Product product, Integer id) {
		Product oldProduct = getProductById(id);
		oldProduct.setName(product.getName());
		oldProduct.setDescription(product.getDescription());
		oldProduct.setPrice(product.getPrice());

		return productRepo.save(oldProduct);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		Product product = getProductById(id);
		if (product == null) {
			return "Product not exist";
		}
		
		productRepo.delete(product);
		return "Product deleted succesfully";
	}

}
