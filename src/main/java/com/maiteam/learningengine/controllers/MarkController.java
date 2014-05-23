package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class MarkController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/mark"
	 * @return mark, les notes de l'étudiant
	 */
	@RequestMapping(value = "/mark", method = RequestMethod.GET)
	public String goToMark()
	{
		return "mark";
	}

		
}
