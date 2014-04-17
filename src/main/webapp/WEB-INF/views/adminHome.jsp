<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src="/learningengin/resources/js/HtmlHelper.js">
	
		</script>
		
	</head>
	
	<body>
	
		<h1> Welcome to admin home page </h1>
		
		<form>
			<c:if test="${users != null}">
			
				<table>
				
				   <caption>
				   		<h3>Liste des utilisateurs</h3>
				   </caption>
				   
				   <thead>
				      <tr>
				         <!--  column's headers -->
				         <th>ID</th>
				         <th>Prénom</th>
				         <th>Nom</th>
				         <th>Login</th>
				         <th>Mot de Passe</th>
				         <th>Groupe</th>
				         <th>Courriel</th>
				      </tr>
				   </thead>
				   
				   <tbody>
				   		<c:forEach var="user" items="${users}">
				   		
					      <tr>
					         <!-- th></th -->   <!-- no line's name -->
					         <td>${user.idUser}</td>
					         <td>${user.firstname}</td>
					         <td>${user.lastname}</td>
					         <td>${user.login}</td>
					         <td>${user.password}</td>
					         <td>${user.role}</td>
					         <td>${user.email}</td>
					         <td>
					         	<input type="button"
									onclick="prepareAction('/learningengin/adminhome/user/<c:out value="${user.idUser}" />/preparemodify')">
									Modifier 
							</td>
								
							<td>
								<input type="button"
										onclick="supprimer('/odes-web/main/<c:out value="${objetCourant}" />/supprimer', '${inputProperty[0].value}')">
										Supprimer
							</td>
								
					      </tr>
					      
				       </c:forEach>
				   </tbody>
				   
				</table>
					
			</c:if>
		</form>
		
	</body>
	
</html>