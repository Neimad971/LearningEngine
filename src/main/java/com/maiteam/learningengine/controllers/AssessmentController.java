package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class AssessmentController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/assessement"
	 * @return assessment, les evaluations de l'étudiant
	 */
	@RequestMapping(value = "/assessment", method = RequestMethod.GET)
	public String goToAssessment() 
	{
		return "assessment";
	}

		
}
