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
 <h1>Cart Details</h1>
 
 <div>
<form:form   modelAttribute="cart" action="/spring-product-web-mvc/spring/deletepp" method="post">
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <td><form:label path="pid"  >Product Id:</form:label></td>
 <td><form:input path="pid" value="${cart.pid}" readonly="true" /></td>
 <td><form:errors path="pid" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="pname">Product Name:</form:label></td>
 <td><form:input path="pname" value="${cart.pname}"/></td>
 <td><form:errors path="pname" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="pprice">Product Price:</form:label></td>
 <td><form:input path="pprice" value="${cart.pprice}"/></td>
 <td><form:errors path="pprice" cssClass="error" /></td>
 </tr>
 
  <tr>
 <td colspan="2"><input type="submit" value="Delete Product"/></td>
 </tr>
 </table>
 Total Cost:${cart.pprice}
 <br/>
  <br/>
  <br/>
 
 <a href="/spring-product-web-mvc/spring/buynow/${c.pid}">
<input type="button" value="Buy Now" class="btn btn-info">
</a> 
 </form:form>
</div>

</div>
 
 </body>
 </html>