package com.cartus.metier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartus.dao.AdministrateurRepository;
import com.cartus.entities.Administrateur;
import com.cartus.entities.Medecin;

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

	@Transactional
	public void accepterMedecin(Medecin m) {
		m.setValidation(1);

		administrateurRepository.acceptermedecin(m.getId(), m.getValidation());
	}

	@Override
	public Medecin refuserMedecin(Medecin m) {

		return null;
	}

	@Override
	public Administrateur verifUsername(String login) {
		// TODO Auto-generated method stub
		return administrateurRepository.verifUsername(login);
	}

}
