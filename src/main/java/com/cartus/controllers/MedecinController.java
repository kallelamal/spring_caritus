package com.cartus.controllers;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cartus.entities.Medecin;
import com.cartus.metier.MedecinMetier;

@RestController
public class MedecinController {
	@Autowired
	private  MedecinMetier medecinMetier;
	
	@RequestMapping(value="/signupMedecin",method=RequestMethod.POST)
	public ResponseEntity<Medecin> signupMedecin( @RequestBody Medecin m) {

		Medecin med = medecinMetier.signupMedecin(m);

		if (med == null)
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		return new ResponseEntity<>(med, HttpStatus.CREATED);
		
	}

	@RequestMapping(value="/signinMedecin",method=RequestMethod.GET)
	public Medecin signinMedecin(String login, String password) {
		return medecinMetier.signinMedecin(login, password);
	}

	@RequestMapping(value="/getAllMedecin",method=RequestMethod.GET)
	public List<Medecin> getAllMedecin() {
		return medecinMetier.getAllMedecin();
	}
	
	@RequestMapping(value="/getMedecinByValidation",method=RequestMethod.GET)
	public List<Medecin> getMedecinByValidation(int validation) {
		return medecinMetier.getMedecinByValidation(validation);
	}
	
	@RequestMapping(value="/getMedecinById",method=RequestMethod.GET)
	public Medecin getMedecinById(Long id) {
		return medecinMetier.getMedecinById(id);
				}
}
