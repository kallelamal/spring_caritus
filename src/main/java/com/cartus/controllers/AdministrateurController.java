package com.cartus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartus.entities.Administrateur;
import com.cartus.entities.Medecin;
import com.cartus.metier.AdministrateurMetier;


@RestController
public class AdministrateurController {
	@Autowired
	private  AdministrateurMetier administrateurMetier;
	
	@RequestMapping(value="/signupAdministrateur",method=RequestMethod.POST)
	public ResponseEntity<Administrateur> signupAdministrateur(@RequestBody Administrateur a) {
		Administrateur adm= administrateurMetier.signupAdministrateur(a);
		if (adm == null)
		       return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		return new ResponseEntity<>(adm, HttpStatus.CREATED);
	}		
}