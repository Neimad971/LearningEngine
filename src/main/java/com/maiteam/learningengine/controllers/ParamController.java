package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class ParamController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/param"
	 * @return param, les parametres de l'Ã©tudiant
	 */
	@RequestMapping(value = "/param", method = RequestMethod.GET)
	public String goToParam() 
	{
		return "param";
	}

		
}
