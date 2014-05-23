package com.maiteam.learningengine.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * contr�leur permettant d'aiguiller les requ�tes HTTP quand on est connect� avec le role "�tudiant"
 */
@Controller
public class StudentCoursesController 
{
	
	/**
	 * aiguillaige de la requ�te HTTP "/learningengine/studentCourses"
	 * @return studentCourses, les cours de l'étudiant
	 */
	@RequestMapping(value = "/studentCourses", method = RequestMethod.GET)
	public String goToStudentCourses()
	{
		return "studentCourses";
	}

		
}
