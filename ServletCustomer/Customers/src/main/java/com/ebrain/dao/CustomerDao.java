package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrain.connection.dp;
import com.ebrain.dto.AddressDto;
import com.ebrain.dto.CustomerAddressDto;
import com.ebrain.dto.CutomerDto;
import com.ebrain.dto.OrderDto;
import com.ebrain.dto.OrderHalfCustomerdto;
import com.ebrain.dto.OrderItemDto;

public class CustomerDao {
	
	public static void saveuser(CutomerDto userobj) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String insertQuery = "insert into tb_customer_nandha(name,code,email,phone,contact_person_name,contact_person_phone,status,created_by,modified_by)values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		//preparedStatement.setString(1, userobj.getId());
		preparedStatement.setString(1, userobj.getName());
		preparedStatement.setString(2, userobj.getCode());
		preparedStatement.setString(3, userobj.getEmail());
	    preparedStatement.setString(4, userobj.getPhone());
		preparedStatement.setString(5, userobj.getContactPersonName());
		preparedStatement.setString(6, userobj.getContactPersonPhone());
		preparedStatement.setString(7, userobj.getStatus());
		
		preparedStatement.setString(8, userobj.getCreatedBy());
		
	    preparedStatement.setString(9, userobj.getModifiedBy());
		preparedStatement.executeUpdate();
	}
	public static void  customersaddress(AddressDto address) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String insertQuery = "insert into tb_customer_address_nandha(customer_id,address_type,address_line1,address_line2,city,state,country,postal_code,created_by,modified_by)values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1, address.getCustomerId());
		preparedStatement.setString(2, address.getAddressType());
		preparedStatement.setString(3, address.getAddressLine1());
		preparedStatement.setString(4, address.getAddressLine2());
	    preparedStatement.setString(5, address.getCity());
		preparedStatement.setString(6, address.getState());
		preparedStatement.setString(7, address.getCountry());
		preparedStatement.setString(8, address.getPostalCode());
		preparedStatement.setString(9, address.getCreatedBy());
		preparedStatement.setString(10, address.getModifiedBy());
		
		preparedStatement.executeUpdate();
	
}
	public static void customerOrder(OrderDto order) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String insertQuery = "insert into tb_customer_order_nandha(customer_id,order_no,order_date,no_of_items,order_sub_total,order_discount,order_total_amount,payment_type,delivery_date,status,created_by,modified_by)values(?,?,?,?,?,?,?,?,?,?,?,?)";   //customer_id,order_no,order_date,no_of_items,order_sub_total,order_discount,order_total_amount,payment_type,delivery_date,status,created_date,created_by,modified_date,modified_by
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1, order.getCustomerId());	
		preparedStatement.setString(2, order.getOrderNo());
		preparedStatement.setString(3, order.getOrderDate());
		preparedStatement.setInt(4, order.getNoofItems());
		preparedStatement.setString(5, order.getOrderSubTotal());
		preparedStatement.setString(6, order.getOrderDiscount());
		preparedStatement.setString(7, order.getOrderTotalAmount());
		preparedStatement.setString(8, order.getPaymenType());
		preparedStatement.setString(9, order.getDeliveryDate());
		preparedStatement.setString(10, order.getStatus());
		
		preparedStatement.setString(11, order.getCreatedBy());
		
		preparedStatement.setString(12, order.getModifiedBy());
		preparedStatement.executeUpdate();
			
		
	}
	
	public static void OrderItemDao(OrderItemDto orderitem) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String insertQuery = "insert into tb_customer_order_item_nandha(order_id,item_name,item_sku,item_rate,ordered_qty,order_total)values(?,?,?,?,?,?)";   //customer_id,order_no,order_date,no_of_items,order_sub_total,order_discount,order_total_amount,payment_type,delivery_date,status,created_date,created_by,modified_date,modified_by
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1, orderitem.getOrderId());	
		preparedStatement.setString(2, orderitem.getItemname());
		preparedStatement.setString(3, orderitem.getItemSku());
		preparedStatement.setString(4, orderitem.getItemRate());
		preparedStatement.setInt(5, orderitem.getOrdered_qty());
		preparedStatement.setString(6, orderitem.getOrderTotal());
		
		preparedStatement.executeUpdate();
	}
	
	public static List<CutomerDto> getAllCustomers() throws ClassNotFoundException {
	    String sql = "SELECT * FROM tb_customer_nandha";
	    List<CutomerDto> customers = new ArrayList<>();

	    try (Connection conn = dp.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	        	CutomerDto customer = new CutomerDto();
	        	customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setCode(rs.getString("code"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getString("phone"));
                customer.setContactPersonName(rs.getString("contact_person_name"));
                customer.setContactPersonPhone(rs.getString("contact_person_phone"));
                customer.setStatus(rs.getString("status").toUpperCase());
                customer.setCreatedDate(rs.getDate("created_date"));
                customer.setCreatedBy(rs.getString("created_by"));
                customer.setModifiedDate(rs.getDate("modified_date"));
                customer.setModifiedBy(rs.getString("modified_by"));

	            customers.add(customer);
	        }

	    } catch (SQLException e) {
	        // handle exceptions
	    }

	    return customers;
	}
	
	public static List<CustomerAddressDto> getAllCustomersAddress() throws ClassNotFoundException {
	    String sql = "SELECT c.id,c.name,c.code,c.email,c.phone,c.contact_person_name,c.contact_person_phone,c.`status`,a.address_type,a.address_line1,a.address_line2,a.city,a.state,a.country,a.postal_code"
                + " FROM tb_customer_nandha c"
                + " JOIN tb_customer_address_nandha a ON c.id = a.customer_id"
                + " WHERE c.status = 'active' AND a.address_type = 'home'";
   
	    List<CustomerAddressDto> customers = new ArrayList<CustomerAddressDto>();                 

	    try (Connection conn = dp.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	        	CustomerAddressDto customer = new CustomerAddressDto();
	        	customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setCode(rs.getString("code"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getString("phone"));
                customer.setContactPersonName(rs.getString("contact_person_name"));
                customer.setContactPersonPhone(rs.getString("contact_person_phone"));
                customer.setStatus(rs.getString("status").toUpperCase());
                customer.setAddressType(rs.getString("address_type").toUpperCase());
                customer.setAddressLine1(rs.getString("address_line1"));
                customer.setAddressLine2(rs.getString("address_line2"));
                customer.setCity(rs.getString("city"));
                customer.setState(rs.getString("state"));
                customer.setCountry(rs.getString("country"));
                customer.setPostalCode(rs.getString("postal_code"));
	            customers.add(customer);
	    
	        }

	    } catch (SQLException e) {
	        // handle exceptions
	    }
	    

	    return customers;

	}
	public static List<CutomerDto> getactiveCustomers() throws ClassNotFoundException {
	    String sql = "SELECT * FROM tb_customer_nandha"
	    		     +" WHERE status ='active'";;
	    List<CutomerDto> customers = new ArrayList<>();

	    try (Connection conn = dp.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	        	CutomerDto customer = new CutomerDto();
	        	customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setCode(rs.getString("code"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getString("phone"));
                customer.setContactPersonName(rs.getString("contact_person_name"));
                customer.setContactPersonPhone(rs.getString("contact_person_phone"));
                customer.setStatus(rs.getString("status").toUpperCase());
                customer.setCreatedDate(rs.getDate("created_date"));
                customer.setCreatedBy(rs.getString("created_by"));
                customer.setModifiedDate(rs.getDate("modified_date"));
                customer.setModifiedBy(rs.getString("modified_by"));

	            customers.add(customer);
	        }

	    } catch (SQLException e) {
	        // handle exceptions
	    }

	    return customers;
	
}
	public static List<OrderHalfCustomerdto> getHalfCustomers() throws ClassNotFoundException {
	    String sql =  "SELECT d.id,b.order_id,b.item_name,d.order_date,d.no_of_items,d.order_sub_total,d.order_discount,d.order_total_amount,d.payment_type,d.status,d.delivery_date"
			    + " FROM tb_customer_order_item_nandha b" //4
			    + " JOIN tb_customer_order_nandha d  ON d.customer_id= b.id WHERE d.id LIMIT 10";//3
	    List<OrderHalfCustomerdto> customers = new ArrayList<>();

	    try (Connection conn = dp.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	        	OrderHalfCustomerdto customer = new OrderHalfCustomerdto();     
	        	customer.setId(rs.getInt("id"));
                customer.setOrderId(rs.getInt("order_id"));
                customer.setItemname(rs.getString("item_name"));
                customer.setOrderDate(rs.getString("order_date"));
                customer.setNoofItems(rs.getInt("no_of_items"));
                customer.setOrderSubTotal(rs.getString("order_sub_total"));
                customer.setOrderDiscount(rs.getString("order_discount"));
                customer.setOrderTotalAmount(rs.getString("order_total_amount"));
                customer.setPaymenType(rs.getString("payment_type"));
                customer.setStatus(rs.getString("status").toUpperCase());
                customer.setDeliveryDate(rs.getString("delivery_date"));
                

	            customers.add(customer);//<tr>//
	      		        }

	    } catch (SQLException e) {
	        // handle exceptions
	    }

	    return customers;
	}
}
