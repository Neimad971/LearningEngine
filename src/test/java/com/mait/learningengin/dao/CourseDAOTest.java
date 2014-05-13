package com.mait.learningengin.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.maiteam.learningengine.dao.CourseDAO;
import com.maiteam.learningengine.models.Course;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/META-INF/spring/root-context.xml" })
public class CourseDAOTest 
{
	@Autowired 
	CourseDAO dao;
	
	
	@Test
	public void findById()
	{
		int id = 1;
		
		Course course = dao.readByID(id);
		
		Assert.assertNull(course);
	}
	
	
	
	@Transactional
	@Test
	public void insert()
	{
		Course toInsert = new Course();
		toInsert.setLabel("JAVA");
		toInsert.setType("online");
		
		dao.create(toInsert);
		
		Course retreive = dao.readByLabel("JAVA");
		
		Assert.assertNotNull(retreive);	
		Assert.assertEquals("JAVA",retreive.getLabel());
		Assert.assertEquals("online",retreive.getType());
	}
	
	
	@Transactional
	@Test
	public void delete()
	{
		Course toInsert = new Course();
		toInsert.setLabel("Hibernate");
		
		dao.create(toInsert);
		
		Course beforeDelete = dao.readByLabel("Hibernate");
		Assert.assertNotNull(beforeDelete);	
		Assert.assertEquals("Hibernate",beforeDelete.getLabel());
		
		dao.delete(beforeDelete);
		Course afterDelete = dao.readByLabel("Hibernate");
		Assert.assertNull(afterDelete);
	}
	
	
	@Transactional
	@Test
	public void update()
	{
		Course toInsert = new Course();
		toInsert.setLabel("Spring");
		
		dao.create(toInsert);
		
		
		Course toUpdate = dao.readByLabel("Spring");
		Assert.assertNotNull(toUpdate);	
		Assert.assertEquals("Spring",toUpdate.getLabel());
		
		toUpdate.setLabel("newName");
		dao.update(toUpdate);
		
		Course updated = dao.readByLabel("newName");
		Assert.assertNotNull(updated);	
		Assert.assertEquals("newName",updated.getLabel());
		
		Course notInDatabase = dao.readByLabel("Spring");
		Assert.assertNull(notInDatabase);
	
	}
}
