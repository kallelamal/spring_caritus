package com.cartus.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Abonne implements Serializable{
	
    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
	private String login;
    private String password;
	private String nom;
	private String prenom;
	private String mail;
	private String tel;
	private String adresse;
	private Date dateNaissance;
	@ColumnDefault(value="null")
	private String image_src;
	//@JsonManagedReference
	//@JsonBackReference
	@OneToMany(mappedBy="abonne",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Publication> publications;
	public Abonne() {
	}

	public Abonne(Long id, String login, String password, String nom, String prenom, String mail, String tel,
			String adresse, Date dateNaissance) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
	}
	


	public Abonne(Long id, String login, String password, String nom, String prenom, String mail, String tel,
			String adresse, Date dateNaissance, String image_src) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.image_src = image_src;
	}
	

	public Abonne(Long id, String login, String password, String nom, String prenom, String mail, String tel,
			String adresse, Date dateNaissance, String image_src, List<Publication> publications) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.image_src = image_src;
		this.publications = publications;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	


	public String getImage_src() {
		return image_src;
	}

	public void setImage_src(String image_src) {
		this.image_src = image_src;
	}

	@JsonIgnore
	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	@Override
	public String toString() {
		return "Abonne [id=" + id + ", login=" + login + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + ", mail=" + mail + ", tel=" + tel + ", adresse=" + adresse + ", dateNaissance="
				+ dateNaissance + ", image_src=" + image_src + "]";
	}

	

}
