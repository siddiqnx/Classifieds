<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>

<link rel='stylesheet' type='text/css' href='css/style.css'/>

<style>
	.logout {
		display: block;
		height: 200px;
		width: 500px;
		background-color: #00adb5;
		color: white;
		margin: 0 auto;
		margin-top: 100px;
		text-align: center;
		font-size: 104px;
		padding-top: 25px;
	}
</style>
</head>
<body>

	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
	%>
	<header>
		<jsp:include page="/header.jsp"/>
	</header>
	
	<a class='logout shadow_rounded' href='Logout'>Logout!</a>
</body>
</html>