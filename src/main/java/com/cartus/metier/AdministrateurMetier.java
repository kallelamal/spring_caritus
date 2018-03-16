package com.cartus.metier;
import com.cartus.entities.Administrateur;
import com.cartus.entities.Medecin;

public interface AdministrateurMetier {
	public Administrateur signupAdministrateur(Administrateur a);
	public Administrateur signinAdministrateur(String login,String password) ;
	public Administrateur verifUsername(String login) ;
	public Medecin accepterMedecin (Medecin m);
	public Medecin refuserMedecin (Medecin m);
}
