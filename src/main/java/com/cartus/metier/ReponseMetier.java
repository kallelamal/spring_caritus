package com.cartus.metier;

import java.util.List;

import com.cartus.entities.Reponse;

public interface ReponseMetier {
	public Reponse addReponse(Reponse r);

	public boolean deleteReponse(Long  id);

	public List<Reponse> getAllReponse();

}
