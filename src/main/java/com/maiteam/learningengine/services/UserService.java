package com.maiteam.learningengine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maiteam.learningengine.dao.UserDAO;
import com.maiteam.learningengine.models.User;

@Component
public class UserService 
{
	
	@Autowired
	UserDAO uDao;
		

	public void  addUser(User User)
	{
		uDao.create(User);
	}
	
	
	public User getUserByID(int id)
	{
		return uDao.readByID(id);
	}
	
	
	public User getUserByLabel(String login)
	{
		return uDao.readByLogin(login);
	}
	
	
	public List<User> getAllUsers()
	{
		return uDao.readAll();
	}
	
	
	public void modify(User User)
	{
		uDao.update(User);
	}
	
	
	public void remove(User User)
	{
		uDao.delete(User);
	}

}
