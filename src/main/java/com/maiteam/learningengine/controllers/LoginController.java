package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class LoginController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/login"
	 * @return login, page d'acces
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String goToLogin() 
	{
		return "login";
	}

		
}
