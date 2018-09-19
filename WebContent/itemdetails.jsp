<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page import="com.classifieds.bean.Item" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item</title>

<link rel='stylesheet' type='text/css' href='css/style.css'/>
<link rel='stylesheet' type='text/css' href='css/itemdetails.css'/>
<%
	Item item = (Item) request.getAttribute("item");
%>
</head>
<body>
	<header id='top'>
		<jsp:include page='header.jsp'/>
	</header>
	<div id="container" class="shadow_rounded">
		
		<h2>${item.getItemTitle()}</h2>
		<h3>Poster: ${item.getItemPoster()}</h3>
		<p>${item.getShortDescription()}</p>
		<p>${item.getLongDescription()}</p>
		<h3>Price: Rs. ${item.getItemPrice()}</h3>
		<p>Address: ${item.getPosterAddress()} </p>
		<p>Contact: ${item.getPosterContact()}</p>
		<div id="category" class="${item.getItemCategory()}-color">${item.getItemCategory()}</div>
	</div>
</body>
</html>