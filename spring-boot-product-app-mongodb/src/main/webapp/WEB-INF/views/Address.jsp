<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 </head>
 <body>
 <div class="container">
 <h1>Submit Address Details</h1>
<form class="form-horizontal" action="/spring-product-web-mvc/spring/Supplier" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Address:</label>
      <div class="col-sm-3">
        <input type="email" class="form-control" id="email" placeholder="Enter Address" name="Address">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Current City</label>
      <div class="col-sm-3">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter City" name="City">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Pin Code</label>
      <div class="col-sm-3">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter Pin" name="Pin">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Phone no:</label>
      <div class="col-sm-3">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter Phone" name="Phone">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="checkbox" name="remember"> Remember Address</label>
        </div>
      </div>
    </div>
    <a href="/spring-product-web-mvc/spring/Supplier/${c.pid}">
<input type="button" value="SUBMIT" class="btn btn-info">
</a>
  </form>
  
  </div>
  </body>
 </html>