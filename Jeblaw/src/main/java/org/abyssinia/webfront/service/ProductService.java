package org.abyssinia.webfront.service;

import java.util.List;

import org.abyssinia.webfront.domain.Product;

public interface ProductService {
	public void save(Product product);
	public void update(Product product);
	public Product findById();
	public List<Product> findAll();
}
