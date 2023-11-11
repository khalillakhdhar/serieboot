package com.secure.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;

@Entity
@Data
public class Auteur extends AuditModel {
	@Column(nullable = false)
	@NotBlank
private String nom;
@Past
private LocalDate dateNaissance;

private String nationalite;
@OneToMany(mappedBy = "auteur",cascade = CascadeType.ALL)
@JsonIgnoreProperties("auteur")
private List<Livre> livres;
}
