package org.abyssinia.webfront.service;

import java.util.List;

import org.abyssinia.webfront.domain.Order;

public interface OrderService {
	public void save(Order order);
	public void update(Order order);
	public Order findById();
	public List<Order> findAll();
	
}
