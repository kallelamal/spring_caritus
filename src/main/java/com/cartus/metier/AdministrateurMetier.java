package com.cartus.metier;
import com.cartus.entities.Administrateur;

public interface AdministrateurMetier {
	public Administrateur signupAdministrateur(Administrateur a);
	public Administrateur signinAdministrateur(String login,String password) ;
}
