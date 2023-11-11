package com.secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {

}
