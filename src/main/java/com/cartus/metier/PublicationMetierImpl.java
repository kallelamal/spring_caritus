package com.cartus.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cartus.dao.PublicationRepository;
import com.cartus.entities.Publication;
@Service
public class PublicationMetierImpl implements PublicationMetier {
	@Autowired
	private PublicationRepository publicationRepository;

	@Override
	public Publication addPublication(Publication p) {
	
		return publicationRepository.save(p);
	}

	@Override
	public boolean deletePublication(Long id) {
		 publicationRepository.delete(id);
		return true;
	}

	@Override
	public List<Publication> getAllPublication() {
		return publicationRepository.findAll();
	}

	@Override
	public List<Publication> getPublicationByspecialite(String spe) {
		return (List<Publication>) publicationRepository.getPublicationByspecialite(spe);
	}

	
	

}
