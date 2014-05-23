package com.maiteam.learningengine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "professeur"
 */
@Controller
public class ProfessorHomeController 
{
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/professorhome"
	 * @return professorHome, home du professeur
	 */
	@RequestMapping(value = "/professorhome", method = RequestMethod.GET)
	public String goToProfessorHome() 
	{
		return "professorHome";
	}
}
