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
	public Medecin addMedecin(Medecin m) {
		// TODO Auto-generated method stub
		return medecinRepository.save(m);
	}
	
	@Override
	public List<Medecin> getAllMedecin() {
		// TODO Auto-generated method stub
		return medecinRepository.findAll();
	}

	@Override
	public List<Medecin> getMedecinByValidation(int validation) {
		// TODO Auto-generated method stub
		return medecinRepository.getMedecinByValidation(validation);
	}

	
}
