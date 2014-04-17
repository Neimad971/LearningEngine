package com.maiteam.learningengine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maiteam.learningengine.dao.CourseDAO;
import com.maiteam.learningengine.models.Course;

@Component
public class CourseService 
{
	
	@Autowired
	private CourseDAO cDao;
	
	
	
	public void  addCourse(Course course)
	{
		cDao.create(course);
	}
	
	
	public Course getCourseByID(int id)
	{
		return cDao.readByID(id);
	}
	
	
	public Course getCourseByLabel(String label)
	{
		return cDao.readByLabel(label);
	}
	
	
	public List<Course> getAllCourses()
	{
		return cDao.readAll();
	}
	
	
	public void modify(Course course)
	{
		cDao.update(course);
	}
	
	
	public void remove(Course course)
	{
		cDao.delete(course);
	}
	
}
