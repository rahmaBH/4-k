package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= " Enfannt",catalog = "jardin")
public class Enfannt {
	
	
	@Id
	 @GeneratedValue(strategy= GenerationType.AUTO)
	
	private int ide;
	@ManyToOne
	private Bus Bus;
	
	public Bus getBus() {
		return Bus;
	}
	public void setBus(Bus bus) {
		Bus = bus;
	}
	
	
	
	
	
	
	
	
	
	
	public int getIde() {
		return ide;
	}
	public void setIde(int ide)  {
		this.ide = ide;
	}
	
	
	
	public Enfannt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enfannt(int ide, String nom, String adresse) {
		super();
		this.ide = ide;
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	private String nom;
	private String adresse;

	
	
	
}
