package com.cartus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	private  AbonneMetier abonneMetier;
	@Autowired
	private  AdministrateurMetier administrateurMetier;
	@Autowired
	private  MedecinMetier medecinMetier;
	
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public Object signinUser(String login, String password) {
		Abonne ab=abonneMetier.signinAbonne(login, password);
		Medecin med=medecinMetier.signinMedecin(login, password);
		Administrateur adm=administrateurMetier.signinAdministrateur(login, password);
		
		if(ab==null && med==null && adm==null )
			return false;
			
		if (ab!=null)
			return ab;
			else if(med!=null)
				return  med;
				else if(adm!=null)
					return adm;
		return true;
	}
}
