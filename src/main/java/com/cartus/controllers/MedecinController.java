package com.cartus.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cartus.entities.Medecin;
import com.cartus.metier.MedecinMetier;

@RestController
public class MedecinController {
	@Autowired
	private  MedecinMetier medecinMetier;
	
	@RequestMapping(value="/signupMedecin",method=RequestMethod.POST)
	public ResponseEntity<Medecin> signupMedecin(@RequestBody Medecin m) {
		Medecin med = medecinMetier.signupMedecin(m);
		
		if (med == null)
	       return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	return new ResponseEntity<>(med, HttpStatus.CREATED);
	}

	@RequestMapping(value="/getAllMedecin",method=RequestMethod.GET)
	public List<Medecin> getAllMedecin() {
		return medecinMetier.getAllMedecin();
	}
	
	@RequestMapping(value="/getMedecinByValidation",method=RequestMethod.GET)
	public List<Medecin> getMedecinByValidation() {
		return medecinMetier.getMedecinByValidation();
	}
	
	@RequestMapping(value="/getMedecinById",method=RequestMethod.GET)
	public Medecin getMedecinById(Long id) {
		return medecinMetier.getMedecinById(id);
	}
	
	@RequestMapping(value = "/updateMedecin", method = RequestMethod.PUT)
	public Medecin updateMedecin(@RequestBody Medecin m) {
		return medecinMetier.updateMedecin(m);
	}
	@RequestMapping(value = "/deleteMedecin", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> refuserMedecin(@RequestBody Map<String, Object> med) {
		Long id = Long.valueOf((Integer)med.get("id"));
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			medecinMetier.deleteMedecin(id);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
	}

}
