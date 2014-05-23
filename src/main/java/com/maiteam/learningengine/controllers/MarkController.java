package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class MarkController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/mark"
	 * @return mark, les notes de l'Ã©tudiant
	 */
	@RequestMapping(value = "/mark", method = RequestMethod.GET)
	public String goToMark()
	{
		return "mark";
	}

		
}
