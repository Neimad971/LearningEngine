<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src="/learningengin/resources/js/HtmlHelper.js">
	
		</script>
	</head>
	
	<body>
	
		<form:form modelAttribute="userToModify"> 
	
			<table>
			
			   <caption>
			   		Informations de ${userToModify.firstname}
			   </caption>
			   
			   <thead>
			      <tr>
			         <th></th> <!-- for column -->
			         
			      </tr>
			   </thead>
			   
			   <tbody>
			      <tr>
			         <th>ID :</th>
			         <td>${userToModify.idUser}</td>
			      </tr> 
			      <tr>
			         <th>Prénom :</th>
			         <td>
			         	<input type="text" value="${userToModify.firstname}" />
			         </td>
			      </tr>
			      <tr>
			         <th>Nom :</th>
			         <td>
			         	<input type="text" value="${userToModify.lastname}" />
			         </td>
			      </tr>
			      <tr>
			         <th>Login :</th>
			         <td>
			         	<input type="text" value="${userToModify.login}" />
			         </td>
			      </tr>
			      <tr>
			         <th>Mot de passe :</th>
			         <td>
			         	<input type="text" value="${userToModify.password}" />
			         </td>
			      </tr> 
			      <tr>
			         <th>Groupe :</th>
			         <td>
			         <input type="text" value="${userToModify.role}" />
			         </td>
			      </tr> 
			      <tr>
			         <th>E-mail :</th>
			         <td>
			         	<input type="text" value="${userToModify.email}" />
			         </td>
			      </tr> 
			    
			    
			   </tbody>
			   
			</table>
			
			<input
				onclick="doAction('annulerId')"
				type="button" value="annuler" id="annulerId">
			
			<input
				onclick="doAction('modifierId', '${userToModify.idUser}')"
				type="button" value="modifier" id="modifierId">
			
		</form:form>
	
	
	
	</body>
	
</html>