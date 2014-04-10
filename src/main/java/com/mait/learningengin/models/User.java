package com.mait.learningengin.models;

/**
 * @author Neimad
 * 
 *  modèle utilisateur
 */
public class User 
{
	/**
	 * identifiant de l'utilisateur
	 */
	private String idUser;
	
	
	/**
	 * prenom de l'utilisateur
	 */
	private String firstname;
	
	
	/**
	 * nom de l'utilisateur
	 */
	private String lastname;
	
	
	/**
	 * speudo de l'utilisateur 
	 */
	private String login;
	
	
	/**
	 * mot de passe de l'utilisateur
	 */
	private String password;
	
	
	/**
	 * role de l'utilisateur  : "etudiant", "professeur", "administrateur"
	 */
	private String role;
	
	
	/**
	 * courriel de l'utilisateur
	 */
	private String email;
	
	
	
	public String getIdUser() 
	{
		return idUser;
	}
	
	
	public void setIdUser(String idUser)
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
