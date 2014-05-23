package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class InformationsController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/informations"
	 * @return informations, les informations sur l'IUT
	 */
	@RequestMapping(value = "/informations", method = RequestMethod.GET)
	public String goToInformations() 
	{
		return "informations";
	}

		
}
