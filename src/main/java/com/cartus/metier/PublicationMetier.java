package com.cartus.metier;

import java.util.List;

import com.cartus.entities.Publication;

public interface PublicationMetier {
	public Publication addPublication(Publication p);

	public boolean deletePublication(Long id);

	public List<Publication> getAllPublication();

	public List<Publication> getPublicationByspecialite(String spe);
}
