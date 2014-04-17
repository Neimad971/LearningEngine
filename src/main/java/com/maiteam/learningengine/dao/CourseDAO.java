package com.maiteam.learningengine.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.maiteam.learningengine.models.Course;


@Component
public class CourseDAO 
{
	
	@PersistenceContext
	private EntityManager mManager;
	
	
	public void create(Course course)
	{
		mManager.persist(course);
	}
	
	
	public Course readByID(int id)
	{
		return mManager.find(Course.class, id);
	}
	
	
	public Course readByLabel(String label)
	{
		try
		{
			Query query = mManager.createQuery("select x from Course x where x.label = :label");
			query.setParameter("label", label);
			
			return (Course) query.getSingleResult();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public List<Course> readAll()
	{
		try
		{
			Query query = mManager.createQuery("select name from Course");
			
			
			return (List<Course>) query.getResultList();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	
	public void update(Course course)
	{
		mManager.merge(course);
	}
	
	
	public void delete(Course course)
	{
		mManager.remove(course);
	}
}
