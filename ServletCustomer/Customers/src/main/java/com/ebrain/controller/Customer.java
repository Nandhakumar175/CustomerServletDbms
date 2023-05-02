package com.ebrain.controller;

import java.io.IOException;

import com.ebrain.dao.CustomerDao;
import com.ebrain.dto.CutomerDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customer
 */
@WebServlet("/Customer")
public class Customer extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Customer() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("CustomerAddress.jsp");
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String code=request.getParameter("code");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String contact_person_name=request.getParameter("contactPersonName");
		String contact_person_phone=request.getParameter("contactPersonPhone");
		String status=request.getParameter("status");
		
		String created_by=request.getParameter("createdBy");
		
		String modified_by=request.getParameter("modifiedBy");
		System.out.println("customers......");
		CutomerDto userobj = new CutomerDto(name, code, email, phone, contact_person_name, contact_person_phone, status,created_by , modified_by);
		try {
			CustomerDao.saveuser(userobj);
		}catch(Exception e) {
			System.out.println(e);
		}

		doGet(request, response);
	}

}
