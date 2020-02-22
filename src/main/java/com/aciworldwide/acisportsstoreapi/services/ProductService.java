package com.aciworldwide.acisportsstoreapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.acisportsstoreapi.model.Product;
import com.aciworldwide.acisportsstoreapi.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	public Product getProduct(Long id) {
		return repository.getOne(id);
	}
	
	
}
