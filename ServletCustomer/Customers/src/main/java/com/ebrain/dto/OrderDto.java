package com.ebrain.dto;

import java.sql.Date;

public class OrderDto {
	private int customerId;
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
	private String  createdBy;
	private Date  modifiedDate;
	private String  modifiedBy;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public OrderDto(int customerId, String orderNo, String orderDate, int noofItems, String orderSubTotal,
			String orderDiscount, String orderTotalAmount, String paymenType, String deliveryDate, String status,
			String createdBy, String modifiedBy) {
		super();
		this.customerId = customerId;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.noofItems = noofItems;
		this.orderSubTotal = orderSubTotal;
		this.orderDiscount = orderDiscount;
		this.orderTotalAmount = orderTotalAmount;
		this.paymenType = paymenType;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}
	
	
	
	
	
	
	

}
