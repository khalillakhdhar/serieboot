package com.secure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secure.entities.Auteur;
import com.secure.entities.Categorie;
import com.secure.entities.Livre;
import com.secure.repo.AuteurRepository;
import com.secure.repo.CategorieRepository;
import com.secure.repo.LivreRepository;
@Service
public class LivreServiceImplement implements LivreService {

	private final AuteurRepository auteurRepository;
	private final LivreRepository livreRepository;
	private final CategorieRepository categorieRepository;
	
	@Autowired
	public LivreServiceImplement(AuteurRepository auteurRepository, LivreRepository livreRepository,
			CategorieRepository categorieRepository) {
		super();
		this.auteurRepository = auteurRepository;
		this.livreRepository = livreRepository;
		this.categorieRepository = categorieRepository;
	}

	@Override
	public Livre getLivreByID(long LivreId) {
		// TODO Auto-generated method stub
		return livreRepository.findById(LivreId).orElse(null);
	}

	@Override
	public List<Livre> getAllLivres() {
		// TODO Auto-generated method stub
		return livreRepository.findAll();
	}

	@Override
	public Livre createLivre(Livre livre,long auteurId,long categorieID) {
		// TODO Auto-generated method stub
		Auteur auteur =auteurRepository.findById(auteurId).orElse(null);
		Categorie categorie=categorieRepository.findById(categorieID).orElse(null);
		if(auteur!=null&& categorie!=null)
		{
			livre.setAuteur(auteur);
			livre.setCategorie(categorie);
			return livreRepository.save(livre);
		}
		else
			return null;
			
		//return livreRepository.save(livre);
	}

	@Override
	public void deleteLivre(long livreId) {
		// TODO Auto-generated method stub
		Livre l=livreRepository.findById(livreId).orElse(null);
		if(l!=null)
			livreRepository.delete(l);
		

	}

}
