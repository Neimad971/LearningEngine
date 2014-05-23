package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class StudentHomeController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/studenthome"
	 * @return studentHome, home de l'étudiant
	 */
	@RequestMapping(value = "/studenthome", method = RequestMethod.GET)
	public String goToStudentHome() 
	{
		return "studentHome";
	}
			

	@RequestMapping(value = "/studentcourses", method = RequestMethod.GET)
	public String goToStudentCourses() 
	{
		return "studentCourses";
	}
		
}
