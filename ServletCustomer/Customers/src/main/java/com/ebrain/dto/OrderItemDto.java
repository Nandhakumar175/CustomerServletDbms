package com.ebrain.dto;

public class OrderItemDto {

	 private int orderId;
	 private String itemname;
	 private String itemSku;
	 private String itemRate;
	 private int ordered_qty;
	 private String orderTotal;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemSku() {
		return itemSku;
	}
	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}
	public String getItemRate() {
		return itemRate;
	}
	public void setItemRate(String itemRate) {
		this.itemRate = itemRate;
	}
	public int getOrdered_qty() {
		return ordered_qty;
	}
	public void setOrdered_qty(int ordered_qty) {
		this.ordered_qty = ordered_qty;
	}
	public String getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(String orderTotal) {
		this.orderTotal = orderTotal;
	}
	public OrderItemDto(int orderId, String itemname, String itemSku, String itemRate, int ordered_qty,
			String orderTotal) {
		super();
		this.orderId = orderId;
		this.itemname = itemname;
		this.itemSku = itemSku;
		this.itemRate = itemRate;
		this.ordered_qty = ordered_qty;
		this.orderTotal = orderTotal;
	}
	
	 
	 
	 
}
