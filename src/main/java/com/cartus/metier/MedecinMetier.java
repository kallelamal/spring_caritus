package com.cartus.metier;

import java.util.List;

import com.cartus.entities.Medecin;

public interface MedecinMetier {
	public Medecin signupMedecin(Medecin m);
	public Medecin signinMedecin(String login,String password) ;
	public List<Medecin> getAllMedecin();
	public List<Medecin> getMedecinByValidation(int validation) ;
	public Medecin getMedecinById(Long id) ;


}
