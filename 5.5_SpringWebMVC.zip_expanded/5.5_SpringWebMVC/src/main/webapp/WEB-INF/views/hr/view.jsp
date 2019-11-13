<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CoderBy</title>
</head>
<body>
<h1>사원 정보 상세 조회</h1>
<table border="1">
<tr>
	<th>EMPLOYEE_ID</th>
	<td>${proj.projloyeeId}</td>
</tr>
<tr>
	<th>FIRST_NAME</th>
	<td>${proj.firstName}</td>
</tr>
<tr>
	<th>LAST_NAME</th>
	<td>${proj.lastName}</td>
</tr>
<tr>
	<th>EMAIL</th>
	<td>${proj.email}</td>
</tr>
<tr>
	<th>PHONE_NUMBER</th>
	<td>${proj.phoneNumber}</td>
</tr>
<tr>
	<th>HIRE_DATE</th>
	<td>${proj.hireDate}</td>
</tr>
<tr>
	<th>JOB_ID</th>
	<td>${proj.jobId}</td>
</tr>
<tr>
	<th>SALARY</th>
	<td>${proj.salary}</td>
</tr>
<tr>
	<th>COMMISSION_PCT</th>
	<td>${proj.commissionPct}</td>
</tr>
<tr>
	<th>MANAGER_ID</th>
	<td>${proj.managerId}</td>
</tr>
<tr>
	<th>DEPARTMENT_ID</th>
	<td>${proj.departmentId}</td>
</tr>
</table>
<a href="update?projid=${proj.projloyeeId}">수정하기</a> 
<a href="delete?projid=${proj.projloyeeId}">삭제하기</a>
</body>
</html>