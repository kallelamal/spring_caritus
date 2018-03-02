package com.cartus.metier;

import java.util.List;


import com.cartus.entities.Medecin;

public interface MedecinMetier {
	public Medecin addMedecin(Medecin m);
	public List<Medecin> getAllMedecin();
	public List<Medecin> getMedecinByValidation(int validation) ;

}
