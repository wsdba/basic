<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <script src="js/jquery-3.3.1.min.js"></script>

<title>Insert title here</title>
</head>
<body>、1111111

<script>
	window.onload = function(){
		$.ajax({
	        type : "post",
	        url : 'user_test.action',
	        async: false,
	        cache: false,
	        contentType: false,
	        processData: false,
	        dataType : "text",//设置需要返回的数据类型
	        success : function( ) {
	        }
	    });		
	}
</script>
</body>
</html>
