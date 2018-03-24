package com.cartus.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cartus.dao.MedecinRepository;
import com.cartus.entities.Medecin;

@Service
public class MedecinMetierImpl implements MedecinMetier{
	@Autowired
	private MedecinRepository medecinRepository;

	@Override
	public Medecin signupMedecin(Medecin m) {
		// TODO Auto-generated method stub
		return medecinRepository.save(m);
	}

	@Override
	public Medecin signinMedecin(String login, String password) {
		// TODO Auto-generated method stub
		return medecinRepository.signinMedecin(login, password)	;
	}
	
	@Override
	public List<Medecin> getAllMedecin() {
		// TODO Auto-generated method stub
		return medecinRepository.findAll();
	}

	@Override
	public List<Medecin> getMedecinByValidation() {
		// TODO Auto-generated method stub
		return medecinRepository.getMedecinByValidation();
	}

	@Override
	public Medecin getMedecinById(Long id) {
		// TODO Auto-generated method stub
		return medecinRepository.findOne(id);
	}

	@Override
	public Medecin verifUsername(String login) {
		// TODO Auto-generated method stub
		return medecinRepository.verifUsername(login)	;
	}

	@Override
	public Medecin updateMedecin(Medecin m) {
		// TODO Auto-generated method stub
		return medecinRepository.saveAndFlush(m);
	}
}
