	<%@ page language='java' contentType='text/html; charset=ISO-8859-1'
    pageEncoding='ISO-8859-1'%>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
	<meta charset='ISO-8859-1'>
	<title>City Classifieds</title>
	
	<link rel='stylesheet' type='text/css' href='css/style.css'/>

</head>
<body>
	
	
	<header id='top'>
		<jsp:include page='header.jsp'/>
	</header>
	
	<div id='main'>
		
		<div id='search' >
			<form action="SearchServlet" method="GET">
				<input type='search' class='shadow_rounded' name='search_string' placeholder='Search using Title'/>
				<input type='submit' value='Search' class='shadow_rounded'/>
			</form>
		</div>
		
		<div id='content'>
			<jsp:include page='content.jsp'/>
		</div>
		
<!-- 		<div id='sidebar' class='shadow_rounded'> -->
<!--  			<jsp:include page='sidebar.jsp'/> --!>
	 			<!-- TODO: Color Codes -->
<!-- 		</div> -->
		
	</div>
	
	<a id="add_button" href="additem">+</a>
	
	<footer id='bottom'>
		<jsp:include page='footer.jsp'/>
	</footer>
	
</body>
</html>