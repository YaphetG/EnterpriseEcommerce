package org.abyssinia.webfront.controller;

import javax.validation.Valid;

import org.abyssinia.webfront.domain.Category;
import org.abyssinia.webfront.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/categories"})
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/add")
	public String getAddNewCategoryForm(@ModelAttribute("newCategory")Category category){
		return "addCategory";
	}
	
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public String processAddNewCategory(@ModelAttribute("newCategory")@Valid Category category,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "addCategory";
		}
		categoryService.save(category);
		return "redirect:/somewhere";
	}
}
