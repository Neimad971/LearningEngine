package com.maiteam.learningengine.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




/**
 * @author Neimad
 *
 * modèle cours
 */
@Entity
@Table(name = "course")
public class Course 
{
	
	
	/**
	 * identifiant du cours
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCourse")
	private int idCourse;
	
	
	/**
	 * identifiant du professeur
	 */
	@Column(name = "idUser")
	private int idUser;
	
	
	/**
	 * intitulé du cours
	 */
	@Column(name = "label")
	private String label;
	
	
	/**
	 * type de cours : présentiel ou en ligne
	 */
	@Column(name = "type")
	private String type;
	
	
	/**
	 * date du cours : jour,mois,année et heure
	 */
	@Column(name = "dateOfCourse")
	private Date dateOfCourse;
	
	
	/**
	 * salle de cours : uniquement pour ceux qui sont en présentiels
	 */
	@Column(name = "room")
	private String room;
	
	
	/**
	 * descriptif du cours 
	 */
	@Column(name = "description")
	private String description;
	
	
	/**
	 * support du cours : *.pdf, *.docx, *.pptx, ...etc
	 */
	@Column(name = "courseMaterial")
	private String courseMaterial;
	
	
	public int getIdCourse() 
	{
		return idCourse;
	}
	
	
	public void setIdCourse(int idCourse) 
	{
		this.idCourse = idCourse;
	}
	
	
	public int getIdUser() 
	{
		return idUser;
	}
	
	
	public void setIdUser(int idUser) 
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
