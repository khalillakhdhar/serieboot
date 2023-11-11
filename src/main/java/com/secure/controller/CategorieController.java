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

import com.secure.entities.Categorie;
import com.secure.repo.CategorieRepository;

@RestController
@RequestMapping("categories")
public class CategorieController {
	@Autowired
	CategorieRepository categorieRepository;
	@GetMapping
	public List<Categorie> getAllCategories()
	{
		return categorieRepository.findAll();
	}
	@PostMapping
	public Categorie addOneCategorie(@RequestBody  Categorie categorie)
	{
		return categorieRepository.save(categorie);
	}
	@DeleteMapping("/{id}")
	public void deleteOneCategory(@PathVariable long id)
	{
		categorieRepository.deleteById(id);
		
	}
	
	

}
