package com.cartus.controllers;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartus.entities.Abonne;
import com.cartus.entities.Administrateur;
import com.cartus.entities.Medecin;
import com.cartus.metier.AbonneMetier;
import com.cartus.metier.AdministrateurMetier;
import com.cartus.metier.MedecinMetier;

@RestController
public class UserController {
	@Autowired
	private AbonneMetier abonneMetier;
	@Autowired
	private AdministrateurMetier administrateurMetier;
	@Autowired
	private MedecinMetier medecinMetier;

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public Object signinUser(@RequestBody Map<String, Object> Sign) {
		String login = (String) Sign.get("login");
		String password = (String) Sign.get("password");
		Abonne ab = abonneMetier.signinAbonne(login, password);
		Medecin med = medecinMetier.signinMedecin(login, password);
		Administrateur adm = administrateurMetier.signinAdministrateur(login, password);
		
		if (ab != null) {
			List<Object> result = new ArrayList<Object>();
			result.add("abonne");
			result.add(ab);
			return new ResponseEntity<Object>(result, HttpStatus.OK);

		} else if (med != null) {
			List<Object> result = new ArrayList<Object>();
			result.add("medecin");
			result.add(med);
			return new ResponseEntity<Object>(result, HttpStatus.OK);
		} else if (adm != null) {
			List<Object> result = new ArrayList<Object>();
			result.add("admin");
			result.add(adm);
			return new ResponseEntity<Object>(result, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/verifUsername", method = RequestMethod.POST)
	public boolean verifUsername(@RequestBody Map<String, Object> Sign) {
		String login = (String) Sign.get("login");
		Abonne ab = abonneMetier.verifUsername(login);
		Medecin med = medecinMetier.verifUsername(login);
		if (ab == null && med == null )
			return false;
		else if (ab != null || med != null )
			return true;
		return true;
	}
}
