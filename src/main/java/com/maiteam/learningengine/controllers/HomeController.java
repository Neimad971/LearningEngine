package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class HomeController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/home"
	 * @return home, la page d'accueil
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goToHome() 
	{
		return "home";
	}

		
}
