<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login | City Classifieds</title>

<link rel="stylesheet" type="text/css" href="css/style.css"/>
<link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body>

	<header>
		<jsp:include page="header.jsp"/>
	</header>
	<form action="LoginController" method="POST" class="shadow_rounded">
		
		<label for="user_email">Email</label>
		<input type="text" id="user_email" name="user_email"/>
		
		<label for="user_password">Password</label>
		<input type="password" id="user_password" name="user_password"/>
		
		<input type="submit" value="Login"/>
	</form>
</body>
</html>