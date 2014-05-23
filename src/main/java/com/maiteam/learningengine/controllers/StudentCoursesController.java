package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contrôleur permettant d'aiguiller les requêtes HTTP quand on est connecté avec le role "étudiant"
 */
@Controller
public class StudentCoursesController 
{
	
	/**
	 * aiguillaige de la requête HTTP "/learningengine/studentCourses"
	 * @return studentCourses, les cours de l'Ã©tudiant
	 */
	@RequestMapping(value = "/studentCourses", method = RequestMethod.GET)
	public String goToStudentCourses()
	{
		return "studentCourses";
	}

		
}
