package com.ust.rabbitfirst.model;




public class PurchaseOrder {

	private String orderId;
	private String company;
	private int qty;
	private double price;
	
	public PurchaseOrder() {
		// TODO Auto-generated constructor stub
	}

	public PurchaseOrder(String orderId, String company, int qty, double price) {
		super();
		this.orderId = orderId;
		this.company = company;
		this.qty = qty;
		this.price = price;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [orderId=" + orderId + ", company=" + company + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
	
}
