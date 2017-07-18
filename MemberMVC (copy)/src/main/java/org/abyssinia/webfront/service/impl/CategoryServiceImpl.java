package org.abyssinia.webfront.service.impl;

import java.util.List;

import org.abyssinia.webfront.domain.Category;
import org.abyssinia.webfront.rest.RestDecorator;
import org.abyssinia.webfront.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	RestDecorator restDecorator;
	
	String rootUrl = "http://localhost:8080/abyssiniaPersistance/";
	
	@Override
	public void save(Category category) {
		RestTemplate restTemplate = restDecorator.getRestTemplate();
		HttpEntity<Category> categoryEntity = new HttpEntity<Category>(category,restDecorator.getHttpHeaders());
		restTemplate.postForObject(this.rootUrl+"category",categoryEntity,Category.class);
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
