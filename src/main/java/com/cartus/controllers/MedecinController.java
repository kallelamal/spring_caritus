package com.cartus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartus.entities.Medecin;
import com.cartus.metier.MedecinMetier;

@RestController
public class MedecinController {
	@Autowired
	private  MedecinMetier medecinMetier;

	@RequestMapping(value="/addMedecin",method=RequestMethod.POST)
	public Medecin addMedecin(Medecin m) {
		return medecinMetier.addMedecin(m);
	}

	@RequestMapping(value="/getAllMedecin",method=RequestMethod.GET)
	public List<Medecin> getAllMedecin() {
		return medecinMetier.getAllMedecin();
	}
	
	@RequestMapping(value="/getMedecinByValidation",method=RequestMethod.GET)
	public List<Medecin> getMedecinByValidation(int validation) {
		return medecinMetier.getMedecinByValidation(validation);
	}

}
