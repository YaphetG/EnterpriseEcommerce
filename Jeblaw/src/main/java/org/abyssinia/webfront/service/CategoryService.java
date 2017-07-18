package org.abyssinia.webfront.service;

import java.util.List;

import org.abyssinia.webfront.domain.Category;

public interface CategoryService {
	public void save(Category category);
	public void update(Category category);
	public Category findById();
	public List<Category> findAll();
	
}
