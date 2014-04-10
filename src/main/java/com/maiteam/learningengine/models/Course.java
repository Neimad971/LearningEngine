package com.maiteam.learningengine.models;

import java.util.Date;


/**
 * @author Neimad
 *
 * modèle cours
 */
public class Course 
{
	/**
	 * identifiant du cours
	 */
	private String idCourse;
	
	
	/**
	 * identifiant du professeur
	 */
	private String idUser;
	
	
	/**
	 * intitulé du cours
	 */
	private String label;
	
	
	/**
	 * type de cours : présentiel ou en ligne
	 */
	private String type;
	
	
	/**
	 * date du cours : jour,mois,année et heure
	 */
	private Date dateOfCourse;
	
	
	/**
	 * salle de cours : uniquement pour ceux qui sont en présentiels
	 */
	private String room;
	
	
	/**
	 * descriptif du cours 
	 */
	private String description;
	
	
	/**
	 * support du cours : *.pdf, *.docx, *.pptx, ...etc
	 */
	private String courseMaterial;
	
	
	public String getIdCourse() 
	{
		return idCourse;
	}
	
	
	public void setIdCourse(String idCourse) 
	{
		this.idCourse = idCourse;
	}
	
	
	public String getIdUser() 
	{
		return idUser;
	}
	
	
	public void setIdUser(String idUser) 
	{
		this.idUser = idUser;
	}
	
	
	public String getLabel() 
	{
		return label;
	}
	
	
	public void setLabel(String label) 
	{
		this.label = label;
	}
	
	
	public String getType() 
	{
		return type;
	}
	
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	
	public Date getDateOfCourse() 
	{
		return dateOfCourse;
	}
	
	
	public void setDateOfCourse(Date dateOfCourse) 
	{
		this.dateOfCourse = dateOfCourse;
	}
	
	
	public String getRoom() 
	{
		return room;
	}
	
	
	public void setRoom(String room) 
	{
		this.room = room;
	}
	
	
	public String getDescription() 
	{
		return description;
	}
	
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	
	public String getCourseMaterial() 
	{
		return courseMaterial;
	}
	
	
	public void setCourseMaterial(String courseMaterial) 
	{
		this.courseMaterial = courseMaterial;
	}
}
