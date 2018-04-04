package com.cartus.entities;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private String message;
    private Date dateRep;
	@ManyToOne
	@JoinColumn(name="id_pub")
	private Publication publication;
	@ManyToOne
	@JoinColumn(name="id_med")
	private Medecin medecin;
	
	public Reponse() {
	}

	public Reponse(Long id, String message, Date dateRep, Publication publication, Medecin medecin) {
		super();
		this.id = id;
		this.message = message;
		this.dateRep = dateRep;
		this.publication = publication;
		this.medecin = medecin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public Date getDateRep() {
		return dateRep;
	}



	public void setDateRep(Date dateRep) {
		this.dateRep = dateRep;
	}



	public Publication getPub() {
		return publication;
	}



	public void setPub(Publication publication) {
		this.publication = publication;
	}

	public Medecin getMedecin() {
		return medecin;
	}



	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}



	@Override
	public String toString() {
		return "reponse [id=" + id + ", message=" + message + ", dateRep=" + dateRep + "]";
	}


}
