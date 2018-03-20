package com.cartus.metier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartus.dao.AdministrateurRepository;
import com.cartus.dao.MedecinRepository;
import com.cartus.entities.Administrateur;

@Service
public class AdministrateurMetierImpl implements AdministrateurMetier {
	@Autowired
	private AdministrateurRepository administrateurRepository;
	@Autowired
	private MedecinRepository MedecinRepositrory;

	@Override
	public Administrateur signupAdministrateur(Administrateur a) {

		return administrateurRepository.save(a);
	}

	@Override
	public Administrateur signinAdministrateur(String login, String password) {

		return administrateurRepository.signinAdministrateur(login, password);
	}

	@Transactional
	public Integer accepterMedecin(Long id ) {
		return administrateurRepository.acceptermedecin(id);
	}

	@Override
	public Administrateur verifUsername(String login) {
		// TODO Auto-generated method stub
		return administrateurRepository.verifUsername(login);
	}

	@Override
	public boolean refuserMedecin(Long id) {
		// TODO Auto-generated method stub
		 MedecinRepositrory.delete(id);
		 return true;
	}

}
