<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>삭제</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
    #content {background: rgb(255, 255, 255); color: black; height: 9%; font-size: 50px;
    font-size: 16px; margin: 15px; text-align: center;}

    #t1 {background: rgb(255, 255, 255); text-align: center; margin-top: 50px; font-size: 30px; letter-spacing: 5px;}
    #ct {color:red}
    </style>   
</head>
<script>
	function check() {
	if(fo.deletename.value == "") {
	alert("삭제할 이름을 입력하세요.");
	fo.deletename.focus();
	return false;}
    else return true;}
</script>
<body>
	<div id="t1">삭제할 이름을 입력하세요.</div>
	         삭제 후 데이터는 복구될 수 없습니다.
	<div id="content">
	    
	    <form name="fo" onsubmit="return check()" action="./delete1" method="POST">
		<label for="name">삭제할 이름</label><br>
		<input type="text" autofocus name="name" placeholder="삭제할 이름을 입력하세요."><br><br>
        
        <button type="submit" class="btn btn-default" value="">삭제</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <button type="reset" class="btn btn-default" value="">취소</button>
        </form>  
    </div>
         
</body>
</html>