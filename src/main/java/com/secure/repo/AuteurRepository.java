package com.secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.entities.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {

}
