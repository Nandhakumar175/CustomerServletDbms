package com.ebrain.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.ebrain.connection.dp;
import com.ebrain.dao.CustomerDao;
import com.ebrain.dto.CutomerDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateTop5Customer
 */
@WebServlet("/UpdateTop5Customer")
public class UpdateTop5Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateTop5Customer() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection conn = null;
        PreparedStatement pstmt = null;
        int numRowsUpdated = 0;
        
        try { //Deleted
            // Step 1: Get a database connection
            conn = dp.getConnection();

            // Step 2: Create a SQL statement
            String sql = "UPDATE tb_customer_nandha SET status = 'Deleted', modified_date = CURRENT_TIMESTAMP "
                       + "WHERE status = 'active' ORDER BY modified_date DESC LIMIT 5";
            pstmt = conn.prepareStatement(sql);

            // Step 3: Execute the SQL statement
            numRowsUpdated = pstmt.executeUpdate();
            System.out.println("Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
        }
        List<CutomerDto> customers = null;
		try {
			customers = CustomerDao.getAllCustomers();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			request.setAttribute("key", customers);
			request.getRequestDispatcher("Update.jsp").forward(request, response);
		
	}

        
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
