<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CoderBy</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

</head>
<body>
<h1>
	HR Mgr Sys  
</h1>
<a href="<c:url value='/hr'/>">사원 목록(동기)</a>
<form id="form">
<input type="text" id="empid" name="employeeId" value="100">
<input type="button" id="getEmp" value="사원정보(비동기 GET 방식)">
<input type="button" id="getEmp2" value="사원정보(비동기 POST 방식)">
</form>
<div id="result"></div>


<a href="<c:url value='/hr/insert1'/>">헤헿</a>


<table border="1">
<tr>
	<th>EMPLOYEE_ID</th>
	<th>FIRST_NAME</th>
	<th>LAST_NAME</th>
	<th>EMAIL</th>
	<th>PHONE_NUMBER</th>
	<th>HIRE_DATE</th>
	<th>JOB_ID</th>
	<th>SALARY</th>
</tr>
<c:forEach var="proj" items="${projList}">
<tr>
	<td>${proj.customerType}</td>
	<td>${proj.name}</td>
	<td>${proj.phoneNumber}</td>
	<td>${proj.cigar}</td>
	<td>${proj.sPoint}</td>
	<td>${proj.ePoint}</td>
	<td>${proj.sTime}</td>
	<td>${proj.memo}</td>
</tr>
</c:forEach>
</table>

</body>
</html>
