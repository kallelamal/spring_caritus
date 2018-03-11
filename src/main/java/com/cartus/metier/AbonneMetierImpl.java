package com.cartus.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartus.dao.AbonneRepository;
import com.cartus.entities.Abonne;

@Service
public class AbonneMetierImpl implements AbonneMetier{
	@Autowired
	private AbonneRepository abonneRepository;

	@Override
	public Abonne signupAbonne(Abonne a) {
		// TODO Auto-generated method stub
		return abonneRepository.save(a);
	}

	@Override
	public Abonne signinAbonne(String login, String password) {
		// TODO Auto-generated method stub
		return abonneRepository.signinAbonne(login, password);
	}

	@Override
	public List<Abonne> getAllAbonne() {
		// TODO Auto-generated method stub
		return abonneRepository.findAll();
	}

}
