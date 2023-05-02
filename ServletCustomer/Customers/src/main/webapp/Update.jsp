<?xml version="1.0" encoding="UTF-8" ?>
<%@ page import="java.util.List" %>
<%@ page import="com.ebrain.dto.CutomerDto" %>
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
	  <td></td>
	  <td>Code</td>
	  <td>Email</td>
	  <td>Phone</td>
	  <td>ContactPersonName:</td>
	  <td>ContactPersonPhone</td>
	  <td>status</td>
	  <td>CreatedDate:</td>
	  <td>CreatedBy:</td>
	  <td>ModifiedDate</td>
	  <td>ModifiedBy</td>
	 </tr>
	  <% 
	 List<CutomerDto> userObj=(List<CutomerDto>)request.getAttribute("key") ;
	 for(CutomerDto myuser:userObj){
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
	 <td><%=myuser.getCreatedDate() %> </td>
	 <td><%=myuser.getCreatedBy() %> </td>
	 <td><%=myuser.getModifiedDate() %> </td>
	 <td><%=myuser.getModifiedBy() %> </td>
	 
	 </tr>
	 
	<%
	}
	%> 
	<tr>
            
            <td><input type="button" value="Return Home"
                onclick="window.location.href='Index.jsp'" /></td>
        </tr>
	
	</table></div>
	<button><a href="Index.jsp"> Return to home</a></button>
	
</body>
</html>