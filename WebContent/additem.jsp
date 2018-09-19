<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>	
	<meta charset="ISO-8859-1">
	<title>Add Item | City Classifieds</title>
	
	<link rel='stylesheet' type='text/css' href='css/style.css'/>
	<link rel='stylesheet' type='text/css' href='css/additem.css'/>
</head>
<body>

	<%
		if(session.getAttribute("userEmail") == null) {
			response.sendRedirect("login.jsp");
		} else {
			String userEmail = session.getAttribute("userEmail").toString();
		}
	%>
	<header id='top'>
		<jsp:include page='header.jsp'/>
	</header>
	<form action='AddItemController' method='GET' class='shadow_rounded' >
		<label for='title'>Title</label>
		<input type='text' id='title' name="item_title"/>
		
		<label for='category'>Category</label>
		<select id='category' name='item_category'>
			<option value='Automobile'>Automobile</option>
			<option value='Land'>Land</option>
			<option value='Electronics'>Electonics</option>
		</select>
		
		<input type='hidden' value='${userEmail}' name='poster_email'>
		
		<label for='short_description'>Short Description</label>
		<input type='text' id='short_description' name='item_short_description' value=''/>
		
		<label for='long_description'>Long Description</label>
		<textarea id='long_description' name='item_long_description'> </textarea>
		<div id='price_group'>
			<label for='price'>Price</label>
			<input type='text' id='price' name='item_price' value=''/>
		</div>
		<label for='address'>Address</label>
		<textarea id='address' name='poster_address'> </textarea>
		
		<label for='contact'>Contact</label>
		<input type='text' id='contact' name='poster_contact' value=''/>
		
		<input type='submit' value='Submit'/>
	</form>
	
	<footer id='bottom'>
		<jsp:include page='footer.jsp'/>
	</footer>
</body>
</html>