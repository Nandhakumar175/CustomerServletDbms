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
background: #cbcbcb;
}
</style>
</head>
<body>
<h2>Fill in the details</h2>
  
    <form action="Order" method="post">
        <div style="background-color:#c3d3db;padding:20px;">
           <table align="center">
            <tr>
                <td>Customer ID :</td>
                <td><input   type="text" name="customerId" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>Order No :</td>
                <td><input type="text" name="orderNo" maxlength="30" size="25" /></td>
            </tr>
            <tr />
             
            
             <tr>
                <td>Order Date :</td>
                <td><input type="date" style="width:210px;" name="orderDate" maxlength="80" size="25" /></td>
            </tr>
            <tr />
             <tr>
                <td>Number of Items :</td>
                <td><input type="text" name="noofItems" maxlength="30" size="25" /></td>
            </tr>
            <tr />
             <tr>
                <td>Order Sub Total :</td>
                <td><input type="text" name="orderSubTotal" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>Order Discount :</td>
                <td><input type="text" name="orderDiscount" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>Order Total Amount :</td>
                <td><input type="text" name="orderTotalAmount" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>Payment Type :</td>
                <td><input type="text" name="paymenType" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>Delivery Date  By:</td>
                <td><input type="date" style="width:210px;" name="deliveryDate" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>Status :</td>
                <td><input type="text" name="status" maxlength="30" size="25" /></td>
            </tr>
            
            <tr />
            <tr>
                <td>Created By  :</td>
                <td><input type="text" name="createdBy" maxlength="30" size="25" /></td>
            </tr>
            
            <tr>
                <td>Modified By  :</td>
                <td><input type="text" name="modifiedBy" maxlength="30" size="25" /></td>
            </tr>
        </table>
        
        <div style="text-align:center">
        <br /> <input type="submit" value="Insert Data" />
       
  </div>
    </form>
    <br />
</body>
</html>