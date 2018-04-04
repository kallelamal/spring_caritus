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

import com.cartus.entities.Reponse;
import com.cartus.metier.ReponseMetier;

@RestController
public class ReponseControllers {
	@Autowired
	private ReponseMetier reponseMetier;
	
	@RequestMapping(value="/getAllReponse",method=RequestMethod.GET)
	public List<Reponse> getAllReponse() {
		return reponseMetier.getAllReponse();
	}
		@RequestMapping(value="/addReponse",method=RequestMethod.POST)
		public ResponseEntity<Reponse> addReponse(@RequestBody Reponse r) {
			Reponse rep = reponseMetier.addReponse(r);
			
			if (rep == null)
		       return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		return new ResponseEntity<>(rep, HttpStatus.CREATED);
		}
		
		@RequestMapping(value = "/deleteReponse", method = RequestMethod.PUT)
		public ResponseEntity<Boolean> removeReponse(@RequestBody Map<String, Object> rep) {
			Long id = Long.valueOf((Integer)rep.get("id"));
			if (id == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else {
				reponseMetier.deleteReponse(id);
				return new ResponseEntity<Boolean>(true,HttpStatus.OK);
			}
		}
	}
	
