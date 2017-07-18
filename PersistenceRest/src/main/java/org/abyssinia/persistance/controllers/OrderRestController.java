package org.abyssinia.persistance.controllers;

import java.util.List;

import org.abyssinia.persistance.service.ProductService;
import org.abyssinia.persistance.util.UrlList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.abyssinia.domain.Product;
@RestController
@RequestMapping(value = UrlList.ORDER)
public class OrderRestController {
	@Autowired	
	ProductService productService;
	
	@RequestMapping(method= RequestMethod.GET)
	public @ResponseBody List<Product> getProducts(){
		return productService.findAll();
	}
	
	@RequestMapping(value=UrlList.ID,method = RequestMethod.GET)
	public @ResponseBody Product getProduct(@PathVariable("Id") Long id){
		return productService.findOne(id);
	}
	
	@RequestMapping(method= RequestMethod.POST)
	@ResponseStatus(code= HttpStatus.NO_CONTENT)
	public void addProduct(@RequestBody Product product){
		productService.save(product);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public void updateProduct(@RequestBody Product product){
		productService.update(product);
	}
	
	
	
}
