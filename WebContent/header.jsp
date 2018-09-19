<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page session="true" %>
<head>
	<link rel="stylesheet" type="text/css" href="css/header.css"/>
</head>
<%
	session.getAttribute("userEmail");
%>
<h1><a href='ClassifiedServlet'>CITY CLASSIFIEDS</a></h1>
<c:set var = "sess" scope = "session" value = "${userEmail}"/>
<div id='user-logo'>
	<div class='logo'> <a href='#'>
	<c:choose>
		<c:when test = "${sessionScope.userEmail == null}">
			<img src='images/user-logo.png'>
		</c:when>
		<c:otherwise>
			<img src ='images/ironman.png'>
		</c:otherwise>
	</c:choose>
	</a> </div>
</div>