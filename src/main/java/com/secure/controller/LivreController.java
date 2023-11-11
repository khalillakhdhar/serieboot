package com.secure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secure.entities.Livre;
import com.secure.service.LivreServiceImplement;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("livres")
public class LivreController {
	@Autowired
	LivreServiceImplement livreServiceImplement;
	@GetMapping("/{LivreId}")
	public ResponseEntity<Livre> getLivreById(@PathVariable  long livreId)
	{
		Livre livre=livreServiceImplement.getLivreByID(livreId);
		return ResponseEntity.ok(livre);
	}
	@GetMapping
	public ResponseEntity<List<Livre>> getAllLivres()
	{
		return ResponseEntity.ok(livreServiceImplement.getAllLivres());
	}
	@PostMapping
	public ResponseEntity<Livre> createOneLivre(@RequestBody Livre livre,@PathParam(value = "auteurid") long auteurid,@PathParam(value = "categorieId") long categorieId )
	{
		Livre lvr=livreServiceImplement.createLivre(livre, auteurid, categorieId);
		return ResponseEntity.ok(lvr);
		
	}
	@DeleteMapping
	public void deleteLivre(long livreId)
	{
		livreServiceImplement.deleteLivre(livreId);
	}
	
	
	
}
