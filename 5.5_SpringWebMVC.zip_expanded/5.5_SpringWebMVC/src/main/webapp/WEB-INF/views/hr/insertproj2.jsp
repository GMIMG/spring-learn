<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CoderBy</title>
</head>
<body>
<h1>사원정보 입력</h1>
<form action="./insert1" method="post">
<table border="1">
<tr>
	<th>Type</th>
	<td><input type="text" name="customerType"></td>
</tr>
<tr>
	<th>Name</th>
	<td><input type="text" name="name"></td>
</tr>
<tr>
	<th>PHONE_NUMBER</th>
	<td><input type="text" name="phoneNumber"></td>
</tr>
<tr>
	<th>Cigar</th>
	<td><input type="text" name="cigar"></td>
</tr>
<tr>
	<th>sPoint</th>
	<td><input type="text" name="sPoint"></td>
</tr>
<tr>
	<th>ePoint</th>
	<td><input type="text" name="ePoint"></td>
</tr>
<tr>
	<th>sTime</th>
	<td><input type="text" name="sTime"></td>
</tr>
<tr>
	<th>Memo</th>
	<td><input type="text" name="memo"></td>
</tr>


<tr>
	<th>&nbsp;</th>
	<td>
		<input type="submit" value="저장"> 
		<input type="reset" value="취소">
	</td>
</tr>
</table>
</form>
</body>
</html>