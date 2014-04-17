package com.maiteam.learningengine.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.maiteam.learningengine.models.User;


@Component
public class UserDAO 
{
	@PersistenceContext
	private EntityManager mManager;
	
	
	public void create(User User)
	{
		mManager.persist(User);
	}
	
	
	public User readByID(int id)
	{
		return mManager.find(User.class, id);
	}
	
	
	public User readByLogin(String login)
	{
		try
		{
			Query query = mManager.createQuery("select x from User x where x.login = :login");
			query.setParameter("login", login);
			
			return (User) query.getSingleResult();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public List<User> readAll()
	{
		try
		{
			Query query = mManager.createQuery("select name from User");
			
			
			return (List<User>) query.getResultList();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	
	public void update(User User)
	{
		mManager.merge(User);
	}
	
	
	public void delete(User User)
	{
		mManager.remove(User);
	}
}
