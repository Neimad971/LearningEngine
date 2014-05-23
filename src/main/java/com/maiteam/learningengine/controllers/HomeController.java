package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class HomeController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/home"
	 * @return home, la page d'accueil
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goToHome() 
	{
		return "home";
	}

		
}
