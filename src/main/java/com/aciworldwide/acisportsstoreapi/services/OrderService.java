package com.aciworldwide.acisportsstoreapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.acisportsstoreapi.model.Order;
import com.aciworldwide.acisportsstoreapi.model.Product;
import com.aciworldwide.acisportsstoreapi.repository.OrderRepository;
import com.aciworldwide.acisportsstoreapi.repository.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepo;

	public List<Order> getOrders() {
		return orderRepo.findAll();
	}

	public Order saveOrder(Order order) {
		return orderRepo.save(order);
	}

}
