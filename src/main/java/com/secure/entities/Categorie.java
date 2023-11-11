package com.secure.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Entity
@Data
public class Categorie extends AuditModel {
	
	@NotBlank
	private String nom;
	@OneToMany(mappedBy = "categorie",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categorie")
	private List<Livre> livres;
}
