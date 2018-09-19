<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body>

	<header>
		<jsp:include page="header.jsp"/>
	</header>
	<form action="AddUsersController" method="POST" class="shadow_rounded">
		
		<label for="user_email">Name</label>
		<input type="text" id="user_name" name="user_name"/>
		
		<label for="user_email">Email ID</label>
		<input type="text" id="user_email" name="user_email"/>
		
		<label for="user_password">Password</label>
		<input type="password" id="user_password" name="user_password"/>
		
		<label for="user_age">Age</label>
		<input type="text" id="user_age" name="user_age"/>
		
		<label for="user_contact">Contact</label>
		<input type="text" id="user_contact" name="user_contact"/>
		
		<label for="user_picture_url">Profile Picture URL</label>
		<input type="text" id="user_picture_url" name="user_picture_url"/>
		
		<input type="submit" value="Login"/>
		
	</form>
</body>
</html>