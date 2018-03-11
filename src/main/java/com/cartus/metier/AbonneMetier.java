package com.cartus.metier;

import java.util.List;
import com.cartus.entities.Abonne;

public interface AbonneMetier {
	public Abonne signupAbonne(Abonne a);
	public Abonne signinAbonne(String login,String password) ;
	public List<Abonne> getAllAbonne();

}
