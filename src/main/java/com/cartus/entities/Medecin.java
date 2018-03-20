package com.cartus.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Medecin implements Serializable{

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
	private String specialite;
	private String telCabinet;
	private String adresseCabinet;
	@ColumnDefault(value="0")
	private int validation;
	private Date dateNaissance;
	
	public Medecin() {	
	}

	public Medecin(Long id, String login, String password, String nom, String prenom, String mail, String tel,
			String specialite, String telCabinet, String adresseCabinet, int validation, Date dateNaissance) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.specialite = specialite;
		this.telCabinet = telCabinet;
		this.adresseCabinet = adresseCabinet;
		this.validation = validation;
		this.dateNaissance = dateNaissance;
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

	public int getValidation() {
		return validation;
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

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getTelCabinet() {
		return telCabinet;
	}

	public void setTelCabinet(String telCabinet) {
		this.telCabinet = telCabinet;
	}

	public String getAdresseCabinet() {
		return adresseCabinet;
	}

	public void setAdresseCabinet(String adresseCabinet) {
		this.adresseCabinet = adresseCabinet;
	}


	public int isValidation() {
		return validation;
	}


	public void setValidation(int validation) {
		this.validation = validation;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Medecin [id=" + id + ", login=" + login + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + ", mail=" + mail + ", tel=" + tel + ", specialite=" + specialite + ", telCabinet="
				+ telCabinet + ", adresseCabinet=" + adresseCabinet + ", validation=" + validation + ", dateNaissance="
				+ dateNaissance + "]";
	}
	
}
