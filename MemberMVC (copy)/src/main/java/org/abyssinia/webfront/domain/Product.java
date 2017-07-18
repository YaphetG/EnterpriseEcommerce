package org.abyssinia.webfront.domain;

import java.io.Serializable;


import org.springframework.web.multipart.MultipartFile;


public class Product implements Serializable {
	private static final long serialVersionUID = 5784L;

	private Long id;

	
	private String name;
	
    public Product() {
	}

	private String description;
	
	private String productId;
	private float price;
    
    private MultipartFile productImage;
    private Category category;
	
	public Product(String name, String description, float price) {
		this.name = name;
		this.description = description;
		this.price = price;
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

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

    public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public MultipartFile getProductImage() {
		return productImage;
	}
	public void setproductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
}