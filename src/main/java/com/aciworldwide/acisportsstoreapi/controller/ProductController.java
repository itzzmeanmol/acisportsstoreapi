package com.aciworldwide.acisportsstoreapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.acisportsstoreapi.model.Product;
import com.aciworldwide.acisportsstoreapi.services.ProductService;

@RestController //Rest controller always provide json data, it will never return viewType object
@RequestMapping("/api/products")
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/all")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@DeleteMapping("/delete")
	public void deleteProduct(@RequestBody Long id) {
		
		productService.deleteProduct(id);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product p) {
		
		return productService.updateProduct(p);
	}
	
	@PostMapping("/insert")
	public Product insertProduct(@RequestBody Product p) {
		return productService.insertProduct(p);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable long id) {
		return productService.getProduct(id);
	}
	
}
