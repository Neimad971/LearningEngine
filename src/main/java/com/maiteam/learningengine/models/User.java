package com.maiteam.learningengine.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Neimad
 * 
 *  modèle utilisateur
 */
@Entity
@Table(name = "course")
public class User 
{
	/**
	 * identifiant de l'utilisateur
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCourse")
	private int idUser;
	
	
	/**
	 * prenom de l'utilisateur
	 */
	@Column(name = "firstname")
	private String firstname;
	
	
	/**
	 * nom de l'utilisateur
	 */
	@Column(name = "lastname")
	private String lastname;
	
	
	/**
	 * speudo de l'utilisateur 
	 */
	@Column(name = "login")
	private String login;
	
	
	/**
	 * mot de passe de l'utilisateur
	 */
	@Column(name = "password")
	private String password;
	
	
	/**
	 * role de l'utilisateur  : "etudiant", "professeur", "administrateur"
	 */
	@Column(name = "role")
	private String role;
	
	
	/**
	 * courriel de l'utilisateur
	 */
	@Column(name = "email")
	private String email;
	
	
	
	public int getIdUser() 
	{
		return idUser;
	}
	
	
	public void setIdUser(int idUser)
	{
		this.idUser = idUser;
	}
	
	
	public String getFirstname() 
	{
		return firstname;
	}
	
	
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	
	
	public String getLastname()
	{
		return lastname;
	}
	
	
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	
	
	public String getLogin() 
	{
		return login;
	}
	
	
	public void setLogin(String login) 
	{
		this.login = login;
	}
	
	
	public String getPassword() 
	{
		return password;
	}
	
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getRole() 
	{
		return role;
	}
	
	
	public void setRole(String role) 
	{
		this.role = role;
	}
	
	
	public String getEmail() 
	{
		return email;
	}
	
	
	public void setEmail(String email)
	{
		this.email = email;
	}	
}
