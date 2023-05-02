package com.ebrain.controller;

import java.io.IOException;

import com.ebrain.dao.CustomerDao;
import com.ebrain.dto.OrderDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Order
 */
@WebServlet("/Order")
public class Order extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Order() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("OrderItem.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Customer_ID = request.getParameter("customerId");
		String Order_No = request.getParameter("orderNo");
		String Order_Date = request.getParameter("orderDate");
		String Number_of_Items = request.getParameter("noofItems");
		String Order_Sub_Total = request.getParameter("orderSubTotal");
		String Order_Discount = request.getParameter("orderDiscount");
		String Order_Total_Amount = request.getParameter("orderTotalAmount");
		String Payment_Type = request.getParameter("paymenType");
		String Delivery_Date_By = request.getParameter("deliveryDate");
		String Status = request.getParameter("status");
		
		String Created_By = request.getParameter("createdBy");
		
		String Modified_By = request.getParameter("modifiedBy");
		System.out.println("customersorder......");
		OrderDto order = new OrderDto(Integer.parseInt(Customer_ID),Order_No,Order_Date,Integer.parseInt(Number_of_Items),Order_Sub_Total,Order_Discount,Order_Total_Amount,Payment_Type,Delivery_Date_By,Status,Created_By,Modified_By);
		try {
			CustomerDao.customerOrder(order);
		}catch(Exception e) {
			System.out.println(e);
		}
		doGet(request, response);
	}
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // TODO Auto-generated method stub
	        
	  /*  String Customer_ID = request.getParameter("customerId");
	    String Order_No = request.getParameter("orderNo");
	    String Order_Date = request.getParameter("orderDate");
	    String Number_of_Items = request.getParameter("noofItems");
	    String Order_Sub_Total = request.getParameter("orderSubTotal");
	    String Order_Discount = request.getParameter("orderDiscount");
	    String Order_Total_Amount = request.getParameter("orderTotalAmount");
	    String Payment_Type = request.getParameter("paymenType");
	    String Delivery_Date_By = request.getParameter("deliveryDate");
	    String Status = request.getParameter("status");
	        
	    String Created_By = request.getParameter("createdBy");
	        
	    String Modified_By = request.getParameter("modifiedBy");
	    System.out.println("customersorder......");
	    
	    if (Customer_ID != null && Number_of_Items != null && Order_Sub_Total != null && Order_Discount != null && Order_Total_Amount != null) {
	        try {
	            OrderDto order = new OrderDto(Integer.parseInt(Customer_ID), Order_No, Order_Date, Integer.parseInt(Number_of_Items), Double.parseDouble(Order_Sub_Total), Double.parseDouble(Order_Discount), Double.parseDouble(Order_Total_Amount), Payment_Type, Delivery_Date_By, Status, Created_By, Modified_By);
	            CustomerDao.customerOrder(order);
	        } catch(Exception e) {
	            System.out.println(e);
	        }
	    } else {
	        System.out.println("One or more required parameters is missing");
	    }*/
	  


}
