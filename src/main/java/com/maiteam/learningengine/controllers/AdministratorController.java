package com.maiteam.learningengine.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maiteam.learningengine.models.User;


@Controller
public class AdministratorController
{
	
	@RequestMapping(value = "/adminhome", method = RequestMethod.GET)
	public String goToAdminHome(Model model) 
	{
		model.addAttribute("users", makeFakeList());
		
		return goBackHome();
	}
	
	
	
	/*** service and DAO will replace this stuff **/
	public List<User> makeFakeList()
	{
		List<User> users = new ArrayList<User>();
		User user = null;
		
		for(int i=0; i<5; i++)
		{
			user = new User();
			user.setIdUser(i);
			user.setFirstname("firstname" + i);
			user.setLastname("lastname" + i);
			user.setLogin("login" + i);
			user.setPassword("password" + i);
			user.setRole("role" + i);
			user.setEmail("email" +i);
			
			users.add(user);
		}
	
		return users;
	}
	
	
	
	/*** this method won't exist here and will be replaced by service and DAO **/
	public User searchUserById()
	{
		User user = new User();
		user.setIdUser(0);
		user.setFirstname("firstname" + 0);
		user.setLastname("lastname" + 0);
		user.setLogin("login" + 0);
		user.setPassword("password" + 0);
		user.setRole("role" + 0);
		user.setEmail("email" + 0);
		
		return user;
	}
	
	
	
	@RequestMapping(value = "/adminhome/user/{id}/preparemodify", method = RequestMethod.GET)
	public String prepareModifyUser(@PathVariable("id") final String id, final Model model) 
	{
		model.addAttribute("userToModify",searchUserById());
		return "modifyUser";
	}
	
	
	
	@RequestMapping(value = "/adminhome/user/{id}/modify", method = RequestMethod.POST)
	public String modifyUser(@PathVariable("id") final String id, final Model model /*, BindingResult result*/) 
	{
		/*if (result.hasErrors())
        {
         
        }*/
		
		return goBackHome();
	}
	
	
	
	public String goBackHome()
	{
		return "adminHome";
	}
	
	
	
	
	

}
