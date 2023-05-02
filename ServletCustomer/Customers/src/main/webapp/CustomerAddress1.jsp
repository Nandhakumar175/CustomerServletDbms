<?xml version="1.0" encoding="UTF-8" ?>
<%@ page import="java.util.List" %>
<%@ page import="com.ebrain.dto.CustomerAddressDto" %>
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
	  <td>Name</td>
	  <td>Code</td>
	  <td>Email</td>
	  <td>Phone</td>
	  <td>ContactPersonName:</td>
	  <td>ContactPersonPhone</td>
	  <td>status</td>
	  <td>AddressType:</td>
	  <td>Address Line1:</td>
	  <td>Address Line2</td>
	  <td>City</td>
	  <td>State</td>
	  <td>Country</td>
	  <td>Postal code</td>
	 </tr>
	  <% 
	 List<CustomerAddressDto> userObj=(List<CustomerAddressDto>)request.getAttribute("key") ;
	 for(CustomerAddressDto myuser:userObj){
	 %>
	 <tr>
	 <td><%=myuser.getId() %> </td>
	 <td><%=myuser.getName() %> </td>
	 <td><%=myuser.getCode() %> </td>
	 <td><%=myuser.getEmail()  %> </td>
	 <td><%=myuser.getPhone() %> </td>
	 <td><%=myuser.getContactPersonName()%> </td>
	 <td><%=myuser.getContactPersonPhone() %> </td>
	 <td><%=myuser.getStatus() %> </td>
	 <td><%=myuser.getAddressType() %> </td>
	 <td><%=myuser.getAddressLine1() %> </td>
	 <td><%=myuser.getAddressLine2() %> </td>
	 <td><%=myuser.getCity() %> </td>
	 <td><%=myuser.getState() %> </td>
	 <td><%=myuser.getCountry() %> </td>
	 <td><%=myuser.getPostalCode() %> </td>
	 
	 </tr>
	 
	<%
	}
	%> 
	
	</table>
	<button><a href="Index.jsp"> Return to home</a></button>
            
          
       
	
</body>
</html>