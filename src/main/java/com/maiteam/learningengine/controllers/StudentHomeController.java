package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class StudentHomeController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengin/studenthome"
	 * @return studentHome, home de l'étudiant
	 */
	@RequestMapping(value = "/studenthome", method = RequestMethod.GET)
	public String goToStudentHome() 
	{
		return "studentHome";
	}
			

	
}
