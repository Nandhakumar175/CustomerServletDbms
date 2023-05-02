<?xml version="1.0" encoding="UTF-8" ?>
<%@ page import="java.util.List" %>
<%@ page import="com.ebrain.dto.OrderHalfCustomerdto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<style>
body{
background: #cbcbcb;
}
</style>
</head>
<body>
<table border="1">
	  <tr>
	  <td>Id</td>
	  <td>OrderId</td>
	  <td>Itemname</td>
	  <td>OrderDate</td>
	  <td>NoofItems</td>
	  <td>OrderSubTotal</td>
	  <td>OrderDiscount</td>
	  <td>OrderTotalAmount</td>
	  <td>PaymenType</td>
	  <td>Status</td>
	  <td>DeliveryDate</td>
	 
	 </tr>
	  <% 
	 List<OrderHalfCustomerdto> userObj=(List<OrderHalfCustomerdto>)request.getAttribute("key") ;
	 for(OrderHalfCustomerdto myuser:userObj){
	 %>
	 <tr>
	 <td><%=myuser.getId()%> </td>        
	 <td><%=myuser.getOrderId()%> </td>
	 <td><%=myuser.getItemname()%></td>
	 <td><%=myuser.getOrderDate()%> </td>
	 <td><%=myuser.getNoofItems()%> </td>
	 <td><%=myuser.getOrderSubTotal()%> </td>
	 <td><%=myuser.getOrderDiscount()%> </td>
	 <td><%=myuser.getOrderTotalAmount()%> </td>
	 <td><%=myuser.getPaymenType()%> </td>
	 <td><%=myuser.getStatus()%> </td>
	 <td><%=myuser.getDeliveryDate()%> </td>
	 </tr>
	 
	<%
	}
	%> 
	<tr>
            
            <td><input type="button" value="Return Home"
                onclick="window.location.href='Index.jsp'" /></td>
        </tr>
	
	</table>
</body>
</html>