package com.ebrain.dto;

import java.sql.Date;

public class OrderHalfCustomerdto {
	
	private int id;
	private String  orderNo;
	private String orderDate;
	private int noofItems;
	private String orderSubTotal;
	private String  orderDiscount;
	private String  orderTotalAmount;
	private String  paymenType ;
	private String  deliveryDate;
	private String  status;
	private Date  createDate;
	
	private int orderId;
	private String itemname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getNoofItems() {
		return noofItems;
	}
	public void setNoofItems(int noofItems) {
		this.noofItems = noofItems;
	}
	public String getOrderSubTotal() {
		return orderSubTotal;
	}
	public void setOrderSubTotal(String orderSubTotal) {
		this.orderSubTotal = orderSubTotal;
	}
	public String getOrderDiscount() {
		return orderDiscount;
	}
	public void setOrderDiscount(String orderDiscount) {
		this.orderDiscount = orderDiscount;
	}
	public String getOrderTotalAmount() {
		return orderTotalAmount;
	}
	public void setOrderTotalAmount(String orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}
	public String getPaymenType() {
		return paymenType;
	}
	public void setPaymenType(String paymenType) {
		this.paymenType = paymenType;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
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
	 

}
