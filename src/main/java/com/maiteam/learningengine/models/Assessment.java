package com.maiteam.learningengine.models;

import java.util.Date;

/**
 * @author Neimad
 *
 * modèle évaluation
 */
public class Assessment 
{
	
	/**
	 * identifiant de l'�valuation
	 */
	private String idAssessment;
	
	
	/**
	 * identifiant du course pour lequel a lieu l'�valuation
	 */
	private String idCourse;
	
	
	/**
	 * date de l'�valuation
	 */
	private Date dateOfAssessment;
	
	
	/**
	 * salle de l'�valuation
	 */
	private String RoomOfAssessment;


	public String getIdAssessment()
	{
		return idAssessment;
	}


	public void setIdAssessment(String idAssessment) 
	{
		this.idAssessment = idAssessment;
	}


	public String getIdCourse() 
	{
		return idCourse;
	}


	public void setIdCourse(String idCourse) 
	{
		this.idCourse = idCourse;
	}


	public Date getDateOfAssessment() 
	{
		return dateOfAssessment;
	}


	public void setDateOfAssessment(Date dateOfAssessment) 
	{
		this.dateOfAssessment = dateOfAssessment;
	}


	public String getRoomOfAssessment() 
	{
		return RoomOfAssessment;
	}


	public void setRoomOfAssessment(String roomOfAssessment) 
	{
		RoomOfAssessment = roomOfAssessment;
	}
	
}
