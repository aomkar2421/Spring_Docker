package com.om.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.om.Entity.Product;
import com.om.service.ProductService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/")
	public ResponseEntity<?> saveProduct(@RequestBody Product product){
		Product newProduct = productService.saveProduct(product);
		return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
	}
	
	
	@PostMapping("/product/{id}")
	public ResponseEntity<?> updateProduct(@RequestBody Product product, @PathVariable Integer id){
		return new ResponseEntity<>(productService.editProduct(product, id), HttpStatus.OK);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?> getAllPProducts(){
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	
	@GetMapping("/product/{id}")
	public ResponseEntity<?> getProductById(@PathVariable Integer id){
		return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
		return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
	}
	
}
