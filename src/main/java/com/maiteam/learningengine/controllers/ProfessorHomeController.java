package com.maiteam.learningengine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "professeur"
 */
@Controller
public class ProfessorHomeController 
{
	/**
	 * aiguillaige de la requête HTTP "/learningengin/professorhome"
	 * @return professorHome, home du professeur
	 */
	@RequestMapping(value = "/professorhome", method = RequestMethod.GET)
	public String goToProfessorHome() 
	{
		return "professorHome";
	}
}
