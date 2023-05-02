
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
<h2>Fill in the details</h2>
  
    <form action="Customer" method="post">
        <div style="background-color:#c3d3db;padding:20px;">
           <table align="center">
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>Code:</td>
                <td><input type="text" name="code" maxlength="30" size="25" /></td>
            </tr>
           
            <tr />
             
            
             <tr>
                <td>Email:</td>
                <td><input type="text" name="email" maxlength="30" size="25" /></td>
            </tr>
            <tr />
             <tr>
                <td>Phone:</td>
                <td><input type="text" name="Phone" maxlength="30" size="25" /></td>
            </tr>
            <tr />
             <tr>
                <td>ContactPersonName:</td>
                <td><input type="text" name="contactPersonName" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>ContactPersonPhone:</td>
                <td><input type="text" name="contactPersonPhone" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>status:</td>
                <td><input type="text" name="status" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>CreatedBy:</td>
                <td><input type="text" name="createdBy" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>ModifiedBy:</td>
                <td><input type="text" name="modifiedBy" maxlength="30" size="25" /></td>
            </tr>
        </table>
        
        <div style="display:flex;justify-content:space-between">
        
         <input type="submit" value="Insert Data" />
         <input type="button" onClick="CustomerAddress.jsp" value="Next"/>
       
  </div>
    </form>
    <br />
</body>
</html> 