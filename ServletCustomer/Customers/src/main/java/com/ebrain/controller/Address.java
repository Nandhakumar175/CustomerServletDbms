package com.ebrain.controller;

import java.io.IOException;

import com.ebrain.dao.CustomerDao;
import com.ebrain.dto.AddressDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Address
 */
@WebServlet("/Address")
public class Address extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("CustomerOrder.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String customer_id=request.getParameter("customerId");
		String address_type=request.getParameter("addressType");
		String address_line1=request.getParameter("addressLine1");	
		String address_line2=request.getParameter("addressLine2");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		
		String postal_code=request.getParameter("postalCode");
		
		String created_by=request.getParameter("createdBy");
		String modified_by=request.getParameter("modifiedBy");
		
		
		
		System.out.println("customers......");
		AddressDto address = new AddressDto(Integer.parseInt(customer_id), address_type, address_line1, address_line2, city, state, country,postal_code ,created_by, modified_by);
		try {
			CustomerDao.customersaddress(address);
		}catch(Exception e) {
			System.out.println(e);
		}
		doGet(request, response);
	}

}
