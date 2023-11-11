package com.secure.service;

import java.util.List;

import com.secure.entities.Livre;

public interface LivreService {
Livre getLivreByID(long LivreId);
List<Livre> getAllLivres();
Livre createLivre(Livre livre,long auteurId,long categorieID);
void deleteLivre(long livreId);

}
