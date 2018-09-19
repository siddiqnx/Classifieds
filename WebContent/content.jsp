<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>

<head>
	<link rel='stylesheet' type='text/css' href='css/content.css'>
</head>

<body>
	
	<c:forEach var='item' items='${item_list}'>
		<div id='content_item' class='shadow_rounded ${item.itemCategory}'>
			<div id='title'>
				<h3>
					<a class="${item.itemCategory}-color" href='ItemDetails?currentItemId=${item.itemId}'>${item.itemTitle}</a>
				</h3>
				<span id='expand_button'>+</span>
			</div>
			<div id='description'>
				<h4>${item.shortDescription}</h4>
			</div>
			<div id='long_description'>
				<h4>${item.longDescription}</h4>
			</div>
		</div>
	</c:forEach>
	<script src='script/script.js'></script>

</body>
</html>