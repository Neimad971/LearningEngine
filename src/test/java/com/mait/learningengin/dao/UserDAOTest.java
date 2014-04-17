package com.mait.learningengin.dao;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.maiteam.learningengine.dao.UserDAO;
import com.maiteam.learningengine.models.User;


@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/META-INF/spring/root-context.xml" })
public class UserDAOTest 
{
	@Resource
	UserDAO dao;
	
	
	@Test
	public void findById()
	{
		int id = 1;
		
		User User = dao.readByID(id);
		
		Assert.assertNull(User);
	}
	
	
	
	@Transactional
	@Test
	public void insert()
	{
		User toInsert = new User();
		toInsert.setFirstname("Damien");
		toInsert.setLogin("neimad971");
		
		dao.create(toInsert);
		
		User retreive = dao.readByLogin("neimad971");
		
		Assert.assertNotNull(retreive);	
		Assert.assertEquals("Damien",retreive.getFirstname());
		Assert.assertEquals("neimad971",retreive.getLogin());
	}
	
	
	@Transactional
	@Test
	public void delete()
	{
		User toInsert = new User();
		toInsert.setFirstname("Romain");
		toInsert.setLogin("wotm");
		
		dao.create(toInsert);
		
		User beforeDelete = dao.readByLogin("wotm");
		Assert.assertNotNull(beforeDelete);	
		Assert.assertEquals("Romain",beforeDelete.getFirstname());
		Assert.assertEquals("wotm",beforeDelete.getLogin());
		
		dao.delete(beforeDelete);
		User afterDelete = dao.readByLogin("wotm");
		Assert.assertNull(afterDelete);
	}
	
	
	@Transactional
	@Test
	public void update()
	{
		User toInsert = new User();
		toInsert.setFirstname("Jeremy");
		toInsert.setLogin("JeremySamLong");
		
		dao.create(toInsert);
		
		
		User toUpdate = dao.readByLogin("JeremySamLong");
		Assert.assertNotNull(toUpdate);	
		Assert.assertEquals("Jeremy",toUpdate.getFirstname());
		
		toUpdate.setLogin("newName");
		dao.update(toUpdate);
		
		User updated = dao.readByLogin("newName");
		Assert.assertNotNull(updated);	
		Assert.assertEquals("newName",updated.getLogin());
		
		User notInDatabase = dao.readByLogin("JeremySamLong");
		Assert.assertNull(notInDatabase);
	}
}
