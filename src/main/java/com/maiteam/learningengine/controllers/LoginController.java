package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class LoginController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/login"
	 * @return login, page d'acces
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String goToLogin() 
	{
		return "login";
	}

		
}
