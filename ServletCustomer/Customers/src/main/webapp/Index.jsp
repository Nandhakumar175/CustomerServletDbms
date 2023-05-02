<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<style>
body{
margin:25vh 0px 0px 0px;
    display: flex;
    justify-content: center;
}
div{
padding: 20px;
    background: #c1c1c8;
}

</style>
</head>
<body>
<div>
<h2 align="center" class="dg">Welcome to Customer Database Management</h2>
    <br />
    <table align="center">
  
        <tr>
            <td>To insert your details into Customers Table :</td>
            <td><input type="button" value="Click Here"
                onclick="window.location.href='CustomerDetails.jsp'" /></td>
        </tr>
        <tr>
            <td>To view your details from the Customers Table       :</td>
            <td><input type="button" value="Click Here"
                onclick="window.location.href='OrderItem'" /></td>
        </tr>
        <tr>
            <td>To Update your Top 5  details from the Cutomer Table:</td>
            <td><input type="button" value="Click Here"
                onclick="window.location.href='UpdateTop5Customer'" /></td>
        </tr>
        
         <tr>
            <td>Active Status From Customers Details                :</td>
            <td><input type="button" value="Click Here"
                onclick="window.location.href='Activecustomer'" /></td>
        </tr>
         <tr>
            <td>Customers status and AddressType Details            :</td>
            <td><input type="button" value="Click Here"
                onclick="window.location.href='CustomerAddress'" /></td>
        </tr>
        <tr>
            <td>Only for the half of the Customers                  :</td>
            <td><input type="button" value="Click Here"
                onclick="window.location.href='OrderHalfCustomer'" /></td>
        </tr>
    </table>
</div>

</body>
</html>