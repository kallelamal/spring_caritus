package com.cartus.entities;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Publication implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private String description;
    private String zone;
	private Date datePub;
	private String pub_mode;
	private boolean consultation_domicile;
	private float position_long;
	private float position_lat;
	@JsonManagedReference
	@OneToMany(mappedBy="publication",fetch=FetchType.LAZY)
	private List<Reponse> reponses;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="id_abonne")
	private Abonne abonne ;
	public Publication() {
		
	}

	public Publication(Long id, String description, String zone, Date datePub, List<Reponse> reponses, Abonne abonne) {
		super();
		this.id = id;
		this.description = description;
		this.zone = zone;
		this.datePub = datePub;
		this.reponses = reponses;
		this.abonne = abonne;
	}
	

	public Publication(Long id, String description, String zone, Date datePub, String pub_mode,
			boolean consultation_domicile, float position_long, float position_lat, List<Reponse> reponses,
			Abonne abonne) {
		super();
		this.id = id;
		this.description = description;
		this.zone = zone;
		this.datePub = datePub;
		this.pub_mode = pub_mode;
		this.consultation_domicile = consultation_domicile;
		this.position_long = position_long;
		this.position_lat = position_lat;
		this.reponses = reponses;
		this.abonne = abonne;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Date getDatePub() {
		return datePub;
	}

	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}

	public List<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}

	public Abonne getAbonne() {
		return abonne;
	}

	public void setAbonne(Abonne abonne) {
		this.abonne = abonne;
	}

	public String getPub_mode() {
		return pub_mode;
	}

	public void setPub_mode(String pub_mode) {
		this.pub_mode = pub_mode;
	}

	public boolean isConsultation_domicile() {
		return consultation_domicile;
	}

	public void setConsultation_domicile(boolean consultation_domicile) {
		this.consultation_domicile = consultation_domicile;
	}

	public float getPosition_long() {
		return position_long;
	}

	public void setPosition_long(float position_long) {
		this.position_long = position_long;
	}

	public float getPosition_lat() {
		return position_lat;
	}

	public void setPosition_lat(float position_lat) {
		this.position_lat = position_lat;
	}

	@Override
	public String toString() {
		return "Publication [id=" + id + ", description=" + description + ", zone=" + zone + ", datePub=" + datePub
				+ ", pub_mode=" + pub_mode + ", consultation_domicile=" + consultation_domicile + ", position_long="
				+ position_long + ", position_lat=" + position_lat + ", reponses=" + reponses + ", abonne=" + abonne
				+ "]";
	}
	

	
	

}
