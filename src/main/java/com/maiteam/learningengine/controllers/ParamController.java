package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class ParamController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/param"
	 * @return param, les parametres de l'étudiant
	 */
	@RequestMapping(value = "/param", method = RequestMethod.GET)
	public String goToParam() 
	{
		return "param";
	}

		
}
