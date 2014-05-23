package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class EDTController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/EDT"
	 * @return EDT, l'Emploi Du Temps de l'étudiant
	 */
	@RequestMapping(value = "/EDT", method = RequestMethod.GET)
	public String goToEDT() 
	{
		return "EDT";
	}

		
}
