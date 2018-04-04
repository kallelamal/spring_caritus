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
import com.cartus.entities.Publication;
import com.cartus.metier.PublicationMetier;

@RestController
public class PublicationControllers  {
	@Autowired
	private PublicationMetier  publicationMetier;
	
	@RequestMapping(value="/getAllPublication",method=RequestMethod.GET)
	public List<Publication> getAllPublication() {
		return publicationMetier.getAllPublication();
	}
		@RequestMapping(value="/addPublication",method=RequestMethod.POST)
		public ResponseEntity<Publication> addReponse(@RequestBody Publication p) {
			Publication pub = publicationMetier.addPublication(p);
			
			if (pub == null)
		       return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		return new ResponseEntity<>(pub, HttpStatus.CREATED);
		}
		@RequestMapping(value = "/deletePublication", method = RequestMethod.PUT)
		public ResponseEntity<Boolean> removeReponse(@RequestBody Map<String, Object> rep) {
			Long id = Long.valueOf((Integer)rep.get("id"));
			if (id == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else {
				publicationMetier.deletePublication(id);
				return new ResponseEntity<Boolean>(true,HttpStatus.OK);
			}
		}
		
		
}
