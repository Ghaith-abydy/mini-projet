package com.gaith.matches.entities;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Typematche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idType;
	private String nomType;
	@OneToMany(mappedBy = "typematche")
	@JsonIgnore
	private List<Matche> Matches;
	public long getIdType() {
		return idType;
	}
	public void setIdType(long idType) {
		this.idType = idType;
	}
	public String getNomType() {
		return nomType;
	}
	public void setNomType(String nomType) {
		this.nomType = nomType;
	}
	public List<Matche> getMatches() {
		return Matches;
	}
	public void setMatches(List<Matche> matches) {
		Matches = matches;
	}
	
	

}