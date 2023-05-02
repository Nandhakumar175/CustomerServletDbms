<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<h2>Fill in the details</h2>
  
    <form action="Address" method="post">
        <div style="background-color:#c3d3db;padding:20px;">
           <table align="center">
            <tr>
                <td>Customer ID:</td>
                <td><input type="text" name="customerId" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>Address Type:</td>
                <td><input type="text" name="addressType" maxlength="50" size="35" /></td>
            </tr>
           
            <tr />
             
            
             <tr>
                <td>Address Line1:</td>
                <td><input type="text" name="addressLine1" maxlength="50" size="25" /></td>
            </tr>
            <tr />
             <tr>
                <td>Address Line2:</td>
                <td><input type="text" name="addressLine2" maxlength="50" size="35" /></td>
            </tr>
            <tr />
             <tr>
                <td>City:</td>
                <td><input type="text" name="city" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>State:</td>
                <td><input type="text" name="state" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>Country:</td>
                <td><input type="text" name="country" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>Postal code:</td>
                <td><input type="text" name="postalCode" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>Created By:</td>
                <td><input type="text" name="createdBy" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>Modified By:</td>
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