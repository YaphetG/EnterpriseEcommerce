package org.abyssinia.persistance.controllers;


import org.abyssinia.domain.Category;
import org.abyssinia.persistance.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(method= RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.OK)
	public void createNewCategory(@RequestBody Category category){
		categoryService.save(category);
	}
}
