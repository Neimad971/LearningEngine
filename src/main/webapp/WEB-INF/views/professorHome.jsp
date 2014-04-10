<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

	<head>
		<title>Home</title>
		<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
	</head>
	
	<body>
	
		<ul id="menu-demo2">
		
			<li><a href="#">Mes cours</a>
				<ul>
					<li><a href="#">En ligne</a></li>
					<li><a href="#">En pr�sentiel</a></li>
					<li><a href="#">Cr�er un nouveau cours</a></li>
				</ul>
			</li>
			
			
			<li><a href="#">Evaluations</a>
				<ul>
					<li><a href="#">Affecter une �valuation � un cours</a></li>
					<li><a href="#">Affecter des notes</a></li>
				</ul>
			</li>
			
			<li><a href="#">IDK</a></li>
			
			<li><a href="#">Param�tres</a>
				<ul>
					<li><a href="http://localhost:8080/learningengin/studenthome">Mon compte</a></li>
					<li><a href="#">D�connexion</a></li>
				</ul>
			</li>
			
		</ul>
		
	</body>
	
</html>
