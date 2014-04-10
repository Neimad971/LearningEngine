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
				</ul>
			</li>
			
			
			<li><a href="#">Evaluations</a></li>
			
			<li><a href="#">R�sultats</a>
				<ul>
					<li><a href="#">Mes notes</a></li>
					<li><a href="#">Mes cours valid�s</a></li>
				
				</ul>
			</li>
			
			<li><a href="#">Param�tres</a>
				<ul>
					<li><a href=http://localhost:8080/learningengin/professorhome>Mon compte</a></li>
					<li><a href="#">D�connexion</a></li>
				</ul>
			</li>
			
		</ul>
		
	</body>
	
</html>
