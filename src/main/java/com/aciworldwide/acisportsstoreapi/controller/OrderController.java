package com.aciworldwide.acisportsstoreapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.acisportsstoreapi.model.Order;
import com.aciworldwide.acisportsstoreapi.model.Product;
import com.aciworldwide.acisportsstoreapi.services.OrderService;


@RestController //Rest controller always provide json data, it will never return viewType object
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/orders")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	public List<Order> getAll(){
		return orderService.getOrders();
	}
	
	@PostMapping("/save")
	public Order orderProducts(@RequestBody Order order){
		return orderService.saveOrder(order);
	}
}
