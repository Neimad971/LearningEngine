package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class ToolsController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/tools"
	 * @return tools, les outils de l'Ã©tudiant
	 */
	@RequestMapping(value = "/tools", method = RequestMethod.GET)
	public String goToAssessment() 
	{
		return "tools";
	}

		
}
