package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class EDTController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/EDT"
	 * @return EDT, l'Emploi Du Temps de l'Ã©tudiant
	 */
	@RequestMapping(value = "/EDT", method = RequestMethod.GET)
	public String goToEDT() 
	{
		return "EDT";
	}

		
}
