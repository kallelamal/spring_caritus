package com.cartus.metier;

import com.cartus.entities.Administrateur;

public interface AdministrateurMetier {

	public Administrateur signinAdministrateur(String login, String password);

	public Integer accepterMedecin(Long id);

	public boolean refuserMedecin(Long id);
}
