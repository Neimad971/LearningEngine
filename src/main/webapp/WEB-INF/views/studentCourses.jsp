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
		
		<title>Mes Cours</title>
	</head>
	
	<body>
	
		<div class="container">
	
	 		<h1>Liste des Cours</h1>
	
			<div class="panel panel-default">
  				<div class="panel-heading">R�capitulatif des cours</div>
	
				<!-- Table -->
				<table class="table">
					<tr><th> Mati�re </th><th> Titre du cours </th><th> Description </th><th> En ligne </th><th> Pr�sentiel </th> </tr>
					<tr><td> Fran�ais </td><td> Methodologies </td><td> Les bases gramaticales </td><td> - </td><td> <button type="button" class="btn btn-info">S'inscrire au cours</button> </td></tr>
					<tr><td> Anglais </td><td> Les verbes irreguliers </td><td> Utilisation des verbes irreguliers </td><td> <button type="button" class="btn btn-info">Acc�der au cours</button> </td><td> - </td></tr>
					<tr><td> Mathematique </td><td> Th�oreme des graphes </td><td> Th�oreme des graphes </td><td> - </td><td> <button type="button" class="btn btn-info">S'inscrire au cours</button> </td></tr>
					<tr><td> Informatique </td><td> Java IG </td><td> Les IHM (JFrames...) </td><td> <button type="button" class="btn btn-info">Acc�der au cours</button> </td><td> <button type="button" class="btn btn-info">S'inscrire au cours</button> </td></tr>

				</table>
			</div>

			<button type="button" class="btn btn-success">Acc�der aux cours suivis</button>

		</div>
		
		
		
	</body>
	
</html>
