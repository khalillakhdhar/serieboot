package com.secure.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Livre extends AuditModel {
	@NotBlank
	@Size(max = 100,min = 3)
private String titre;
	@Min(1900)
	@Max(2023)
private int anneePublication;
	@Pattern(regexp="[0-9 ]{4}")
private String isbn;
@ManyToOne
@JoinColumn(name = "auteur_id")
@JsonIgnoreProperties("livres")
private Auteur auteur;
@ManyToOne
@JoinColumn(name = "categorie_id")
@JsonIgnoreProperties("livres")
private Categorie categorie;



}
