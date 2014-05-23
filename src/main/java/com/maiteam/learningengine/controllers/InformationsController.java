package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class InformationsController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/informations"
	 * @return informations, les informations sur l'IUT
	 */
	@RequestMapping(value = "/informations", method = RequestMethod.GET)
	public String goToInformations() 
	{
		return "informations";
	}

		
}
