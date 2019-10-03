<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th{
  border: 1px solid black;
}


.header {
  background-color: #f1f1f1;
  padding: 30px;
  text-align: center;
background: white;
}
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
 padding-top: 10px;
 margin-left: 14em;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;


}
.nav-collapse {
  margin-left: 1em;

}
</style>
</head>
<body>


<div class="header">
<h1>Travel Line</h1>
  <img src="images\bus.jpg" alt="bus" style="width:1000px;height:300px;">
</div>
<div class="nav-collapse">

<div class="topnav">
<a href="Bus_Home.html">Home</a>
<a href="ContactUs.html">Contact Us</a>
<a href="Admin_login.html">Admin Login</a>
</div>
</div>
<div align="center" ><br>

<%request.getAttribute("tdetails"); %>
<h2>Ticket Details</h2>
<form action="DeleteServiceServlet" method="get">
  <table style="width: 100%" border="100px">
  <tr>
    <th>ticket_no</th>
    <th>Passenger Name</th> 
    
    <th>gender</th>
    <th>age</th>
    <th>Fare</th>
    <th>seat_no</th>
	<th> From Station</th>
	<th>To Station</th>
	<th>Service No</th>
	<th>Departure Date</th>
	<th>Reporting Time(hr)</th>
  </tr>
  <tr>
  <td><input type="number" name="ticketno" value="${ tdetails.passengerId}"/></td>
  <%-- <td><c:out value="${ tdetails.passengerId}" /></td> --%>
  <td><c:out value="${ tdetails.passengerName}" /></td>
  <td><c:out value="${ tdetails.gender}" /></td>
  <td><c:out value="${ tdetails.age}" /></td>
  <td><c:out value="${ tdetails.fare}" /></td>
  <td><c:out value="${ tdetails.seatNo}" /></td>
  <td><c:out value="${ tdetails.from}" /></td>
  <td><c:out value="${ tdetails.to}" /></td>
   <td><c:out value="${ tdetails.service_id}" /></td>
    <td><c:out value="${ tdetails.departureTime}" /></td>
     <td><c:out value="${ tdetails.reporting}" /></td>
  </tr>
  </table><br><br>



<button type="submit"  value="cancel ticket">cancel ticket</button>

</form>
</div>
</body>
</html>
