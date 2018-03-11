package com.cartus.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartus.entities.Abonne;
import com.cartus.metier.AbonneMetier;
import com.google.gson.Gson;

@RestController
public class AbonneController {
	Gson json =new Gson();
	@Autowired
	private  AbonneMetier abonneMetier;

	@RequestMapping(value="/signupAbonne",method=RequestMethod.POST)
	public Abonne signupAbonne(@RequestBody String a) throws Exception {
		Abonne ab=json.fromJson(a,Abonne.class);
		return abonneMetier.signupAbonne(ab);
	}

	@RequestMapping(value="/signinAbonne",method=RequestMethod.GET)
	public Abonne signinAbonne(String login, String password) {
		return abonneMetier.signinAbonne(login, password);
	}

	@RequestMapping(value="/getAllAbonne",method=RequestMethod.GET)
	public List<Abonne> getAllAbonne() {
		return abonneMetier.getAllAbonne();
	}

	
}
