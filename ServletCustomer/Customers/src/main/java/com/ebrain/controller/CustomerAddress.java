package com.ebrain.controller;

import java.io.IOException;
import java.util.List;

import com.ebrain.dao.CustomerDao;
import com.ebrain.dto.CustomerAddressDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerAddress
 */
@WebServlet("/CustomerAddress")
public class CustomerAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerAddress() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<CustomerAddressDto> customers = null;
			try {
				customers = CustomerDao.getAllCustomersAddress();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println("1");
				request.setAttribute("key", customers);
				System.out.println("2");
				request.getRequestDispatcher("CustomerAddress1.jsp").forward(request, response);
			
		}
		

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
