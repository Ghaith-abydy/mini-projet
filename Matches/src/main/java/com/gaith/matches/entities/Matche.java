package com.gaith.matches.entities;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Matche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long idMatch;


	private String nomEquipes;
	private double Profit;
	private Date dateMatch;
	@ManyToOne
	private Typematche typematch;

	@Override
	public String toString() {
		return "Matche [idMatch=" + idMatch + ", nomEquipes=" + nomEquipes +  ",Profit "
			+Profit +	 ", dateMatch=" + dateMatch + "]";
	}

	public Matche() {
		super();
	}

	public Matche(long idMatch, String nomEquipes,  double Profit, Date dateMatch) {
		super();
		this.idMatch = idMatch;
		this.nomEquipes = nomEquipes;
		this.Profit = Profit;
		this.dateMatch = dateMatch;
	}

	public String getNomEquipes() {
		return nomEquipes;
	}

	public void setNomEquipes(String nomEquipes) {
		this.nomEquipes = nomEquipes;
	}

	public double getProfit() {
		return Profit;
	}

	public void setProfit(double profit) {
		Profit = profit;
	}

	public long getIdMatch() {
		return idMatch;
	}
	public Date getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(Date dateMatch) {
		this.dateMatch = dateMatch;
	}

	public Typematche getTypeMatch() {
		return typematch;
	}

	public void setTypeMatch(Typematche typeMatch) {
		this.typematch = typeMatch;
	}

}