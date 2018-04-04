package com.cartus.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartus.dao.PublicationRepository;
import com.cartus.dao.ReponseRepository;
import com.cartus.entities.Reponse;
@Service
public class ReponseMetierImpl implements ReponseMetier {
	@Autowired
	private ReponseRepository reponseRepository;
	@Override
	public Reponse addReponse(Reponse r) {
	
		return reponseRepository.save(r);
	}

	@Override
	public boolean deleteReponse(Long id) {
		
		 reponseRepository.delete(id);
		 return true;
	}

	@Override
	public List<Reponse> getAllReponse() {
	
		return reponseRepository.findAll();
	}

}
