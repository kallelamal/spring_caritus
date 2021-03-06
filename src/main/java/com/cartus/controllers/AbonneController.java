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

import com.cartus.entities.Abonne;
import com.cartus.metier.AbonneMetier;

@RestController
public class AbonneController {
	@Autowired
	private AbonneMetier abonneMetier;

	@RequestMapping(value = "/signupAbonne", method = RequestMethod.POST)
	public ResponseEntity<Abonne> signupAbonne(@RequestBody Abonne a) {
		Abonne ab = abonneMetier.signupAbonne(a);
		if (ab == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		return new ResponseEntity<>(ab, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/getAllAbonne", method = RequestMethod.GET)
	public List<Abonne> getAllAbonne() {
		return abonneMetier.getAllAbonne();
	}
	
	@RequestMapping(value = "/deleteAbonne", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> deleteAbonne(@RequestBody Map<String, Object> abn) {
		Long id = Long.valueOf((Integer)abn.get("id"));
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			abonneMetier.deleteAbonne(id);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/getAbonneById",method=RequestMethod.GET)
	public Abonne getAbonneById(Long id) {
		return abonneMetier.getAbonneById(id);
	}
	
	@RequestMapping(value = "/updateAbonne", method = RequestMethod.PUT)
	public Abonne updateAbonne(@RequestBody Abonne a) {
		return abonneMetier.updateAbonne(a);
	}
}
