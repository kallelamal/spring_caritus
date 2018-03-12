package com.cartus.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartus.dao.AdministrateurRepository;
import com.cartus.entities.Administrateur;
@Service
public class AdministrateurMetierImpl implements AdministrateurMetier {
	@Autowired
	private AdministrateurRepository administrateurRepository;

	@Override
	public Administrateur signupAdministrateur(Administrateur a) {
		
		return administrateurRepository.save(a);
	}

	@Override
	public Administrateur signinAdministrateur(String login, String password) {
		
		return administrateurRepository.signinAdministrateur(login, password);
	}

}
