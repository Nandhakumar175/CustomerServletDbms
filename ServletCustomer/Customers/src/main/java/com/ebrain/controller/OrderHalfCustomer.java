package com.ebrain.controller;

import java.io.IOException;
import java.util.List;

import com.ebrain.dao.CustomerDao;

import com.ebrain.dto.OrderHalfCustomerdto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderHalfCustomer
 */
@WebServlet("/OrderHalfCustomer")
public class OrderHalfCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public OrderHalfCustomer() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<OrderHalfCustomerdto> customers = null;
		try {
			customers = CustomerDao.getHalfCustomers();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			request.setAttribute("key", customers);
			request.getRequestDispatcher("OrderhalfCustomer.jsp").forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
