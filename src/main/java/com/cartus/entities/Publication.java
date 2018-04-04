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
	@OneToMany(mappedBy="id_pub",fetch=FetchType.LAZY)
	private List<Reponse> reponses;
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



	@Override
	public String toString() {
		return "publication [id=" + id + ", description=" + description + ", zone=" + zone + ", datePub=" + datePub
				+ ", reponses=" + reponses + "]";
	}
	
	

}
