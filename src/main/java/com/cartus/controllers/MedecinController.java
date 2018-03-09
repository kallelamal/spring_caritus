package com.cartus.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartus.entities.Medecin;
import com.cartus.metier.MedecinMetier;
import com.google.gson.Gson;

@RestController
public class MedecinController {
	Gson json =new Gson();
	@Autowired
	private  MedecinMetier medecinMetier;

	/*@RequestMapping(value="/signupMedecin",method=RequestMethod.POST)
	public Medecin signupMedecin(Medecin m) {
		return medecinMetier.signupMedecin(m);
	}*/
	@RequestMapping(value="/signupMedecin",method=RequestMethod.POST)
	public Medecin signupMedecin(@RequestBody String m) throws Exception {
			
		Medecin med=json.fromJson(m,Medecin.class);
		return medecinMetier.signupMedecin(med);

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

}
