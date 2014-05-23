package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class AssessmentController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/assessement"
	 * @return assessment, les evaluations de l'Ã©tudiant
	 */
	@RequestMapping(value = "/assessment", method = RequestMethod.GET)
	public String goToAssessment() 
	{
		return "assessment";
	}

		
}
