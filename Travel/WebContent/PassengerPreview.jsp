<%@page import="com.vir.model.Passenger"%>
<%@page import="com.vir.service.PassengerServiceImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment </title>
<style>
button[type=submit], button[type=reset],button[type=cancel]{
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 6px 10px;
  text-decoration: none;
  margin: 2px 2px;
  cursor: pointer;
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
 margin-left: 10em;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;


}
.nav-collapse {
  margin-left: 1em;

}
pre
{
font-family:verdana;
font-size:14;
color:blue;
}
</style>
</head>
<body >
<div class="header">
<h1>Travel Line</h1>
  <img src="images\bus.jpg" alt="bus" style="width:850px;height:220px;">
</div>
<div class="nav-collapse">

<div class="topnav">

<a href="Bus_Home.html">Home</a>
<a href="ContactUs.html">Contact Us</a>
<a href="retrival1.html">Retrieval</a>
<a href="Admin_login.html">Admin Login</a>
</div>
</div>
<div align="center"><br>

<h2>Passenger Details</h2>
<%
PassengerServiceImpl ps=new PassengerServiceImpl();

request.getAttribute("pdetails");%>
<form action="paymentgateway" method="get">
<div style="width:550px;height:130px;border:10px solid #000;color:blue;background-color:LightGray"><br>

<table style="width: 100%; border:100px">
<tr>
<th>Passenger No</th>
<th>Passenger Name</th>
<th>Passenger Age</th>
<th>Gender</th>
<th>Amount</th>
<th>Seat No</th>
</tr>
<tr>
<td><c:out value="${pdetails.passengerId }"/></td>
<td><c:out value="${pdetails.passengerName }"/></td>
<td><c:out value="${pdetails.age }"/></td>
<td><c:out value="${pdetails.gender }"/></td>
<td><c:out value="${pdetails.fare }"/></td>
<td><c:out value="${pdetails.seatNo }"/></td>

</tr>
<!-- card holder name:<input type="text" id="card holder name" name="card holder name" pattern="[a-z A-Z]+" placeholder="enter alphabets only" required="required"><br>
      card number:<input type="text" name="card number" name="number" pattern="[3-6][0-9]{13,16}" placeholder="enter 13/16 digit card number" required="required"><br> -->
                  <%-- fare:<input type="number" name="fare" value="${pdetails.fare}" disabled/></td></tr> --%>
                  </table> 

<button type="submit"  value="submit">Proceed</button>

<button  type="cancel" onclick="location.href='Bus_Home.html';">back</button>
</div> 
</form>

</div>
</body>
</html>