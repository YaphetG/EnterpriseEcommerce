package org.abyssinia.webfront.domain;

import java.util.HashSet;
import java.util.Set;



public class Category {

	private Long id;

	String name;
	
	String description;

	Set<Product> products = new HashSet<Product>();

	public Category() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Product> getItems() {
		return products;
	}

	public void setItems(Set<Product> products) {
		this.products = products;
	}

	public void addItem(Product product) {
		this.products.add(product);

	}
}
