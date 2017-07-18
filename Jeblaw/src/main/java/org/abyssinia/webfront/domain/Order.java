package org.abyssinia.webfront.domain;



import java.util.ArrayList;
import java.util.List;

public class Order{
	
	private static final long serialVersionUID = 5784L;
	
	
	private Long id = null;
	
	private int version = 0;

	private String orderNumber;

	private List<OrderItem> items = new ArrayList<OrderItem>();

	private OrderPayment payment;
	
	public Order(String orderNumber, List<OrderItem> items, OrderPayment payments) {

		this.orderNumber = orderNumber;
		this.items = items;
		this.payment = payments;
	}

	public void setPayments(OrderPayment payment) {
		this.payment = payment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public void addOrderItem(OrderItem orderItem) {
		this.items.add(orderItem);
		orderItem.setOrder(this);
	}

}
