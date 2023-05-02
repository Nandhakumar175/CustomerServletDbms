package com.ebrain.controller;

import java.io.IOException;
import java.util.List;

import com.ebrain.dao.CustomerDao;
import com.ebrain.dto.CutomerDto;
import com.ebrain.dto.OrderItemDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderItem
 */
@WebServlet("/OrderItem")
public class OrderItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public OrderItem() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<CutomerDto> customers = null;
		try {
			customers = CustomerDao.getAllCustomers();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			request.setAttribute("key", customers);
			request.getRequestDispatcher("CustomerDetailsSelect.jsp").forward(request, response);
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  Order_Id = request.getParameter("orderId");
		String  Item_Name = request.getParameter("itemname");
		String  Item_Sku = request.getParameter("itemSku");
		String  Item_Rate = request.getParameter("itemRate");
		String  Ordered_Qty = request.getParameter("ordered_qty");
		String  Order_Total = request.getParameter("orderTotal");
		
		System.out.println("customers......");
		OrderItemDto orderitem = new OrderItemDto(Integer.parseInt(Order_Id), Item_Name, Item_Sku, Item_Rate, Integer.parseInt(Ordered_Qty), Order_Total);
		try {
			CustomerDao.OrderItemDao(orderitem);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		doGet(request, response);
	}

}
