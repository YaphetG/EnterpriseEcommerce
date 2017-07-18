package org.abyssinia.webfront.domain;




public class OrderItem {

	private Long id = null;
	private int quantity;

	private Order order;

	private Product product;

	public OrderItem() {

	}

	public OrderItem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getItem() {
		return product;
	}

	public void setItem(Product product) {
		this.product = product;
	}

}