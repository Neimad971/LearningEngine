<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

	<link href="./resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="screen" />
	<link href="./resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="screen" />
	<link href="./resources/css/bootstrap-theme.css" rel="stylesheet" type="text/css" media="screen" />
	<link href="./resources/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css" media="screen" />

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<jsp:include page="Menu.jsp"></jsp:include>
		
		<title>Resultats</title>
	</head>
	
	<body>
		<div class="container">
	
	 		<h1>Mes notes</h1>

			<table class="table table-striped">
				<tr><th> Matière </th><th> Titre du cours </th><th> Date d'examens </th><th> Note /20 </th><th> Commentaire </th> </tr>
			
				<tr class="success">
				<td>Informatique</td><td>Java IG</td><td>01/04/2014</td><td>14</td><td></td>
				</tr>
				<tr class="warning">
				<td>Mathematique</td><td>Statistiques</td><td>08/04/2014</td><td>7</td><td></td>
				</tr>	
				<tr class="info">
				<td>Français</td><td>Grammaire 1</td><td>10/04/2014</td><td>ABS</td><td>Absence justifiée</td>
				</tr>	
				<tr class="danger">
				<td>Anglais</td><td>Savoir se présenter</td><td>14/04/2014</td><td>0</td><td>Absence injustifiée</td>
				</tr>
				
			</table>
		</div>
		
	</body>
	
</html>
