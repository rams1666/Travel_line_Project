<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="rowno" value="${param.radioButton - 1}"/>
    <h3>Seats</h3>
    <table border="1" cellpadding="5">
      <tr>
        <td>Service No</td>
        <td>${listData[rowno].serviceId}</td>
      </tr>
      <tr>
        <td>Service From</td>
        <td>${listData[rowno].serviceFrom}</td>
      </tr>
      <tr>
        <td>Service To</td>
        <td>${listData[rowno].serviceTo}</td>
      </tr>
      <tr>
        <td>Departure Date</td>
        <td>${listData[rowno].departureTime}</td>
      </tr>
    </table>
</body>
</html>