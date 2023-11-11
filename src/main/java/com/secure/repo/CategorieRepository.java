package com.secure.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
