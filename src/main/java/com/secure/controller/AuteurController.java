package com.secure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secure.entities.Auteur;
import com.secure.repo.AuteurRepository;

@RestController
@RequestMapping("auteurs")
public class AuteurController {
	@Autowired
	AuteurRepository auteurRepository;
	@GetMapping
	public List<Auteur> getAllAuteurs()
	{
		return auteurRepository.findAll();
	}
	@PostMapping
	public Auteur addOneAuteur(@RequestBody  Auteur auteur)
	{
		return auteurRepository.save(auteur);
	}
	@DeleteMapping("/{id}")
	public void deleteOneCategory(@PathVariable long id)
	{
		auteurRepository.deleteById(id);
		
	}
	
	

}