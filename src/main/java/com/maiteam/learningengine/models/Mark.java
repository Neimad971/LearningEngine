package com.maiteam.learningengine.models;


/**
 * @author Neimad
 *
 * modèle note
 */
public class Mark
{
	/**
	 * identifiant de la note
	 */
	private String idMark;
	
	
	/**
	 * identifiant de l'étudiant
	 */
	private String idUser;
	
	
	/**
	 * identifiant du cours
	 */
	private String idAssessment;
	
	
	/**
	 * valeur de la note
	 */
	private double score;


	public String getIdMark()
	{
		return idMark;
	}


	public void setIdMark(String idMark) 
	{
		this.idMark = idMark;
	}


	public String getIdUser() 
	{
		return idUser;
	}


	public void setIdUser(String idUser) 
	{
		this.idUser = idUser;
	}


	public String getIdAssessment() 
	{
		return idAssessment;
	}


	public void setIdAssessment(String idAssessment) 
	{
		this.idAssessment = idAssessment;
	}


	public double getScore() 
	{
		return score;
	}


	public void setScore(double score) 
	{
		this.score = score;
	}
}
