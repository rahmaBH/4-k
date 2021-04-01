package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name= "Meetmedecin2",catalog = "jardin")
public class Meetmedecin2 {
	public Meetmedecin2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)

	
	public int getIdmeetmed2() {
		return idmeetmed2;
	}

	public void setIdmeetmed2(int idmeetmed2) {
		this.idmeetmed2 = idmeetmed2;
	}

	public String getSalle() {
		return salle;
	}



	public void setSalle(String salle) {
		this.salle = salle;
	}



	
	
	public String getDatemeet() {
		return datemeet;
	}
	public void setDatemeet(String datemeet) {
		this.datemeet = datemeet;
	}
	public String getMaladie() {
		return maladie;
	}
	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMadecin() {
		return madecin;
	}
	public void setMadecin(String madecin) {
		this.madecin = madecin;
	}
	public String getEnfant() {
		return enfant;
	}
	public void setEnfant(String enfant) {
		this.enfant = enfant;
	}
	public String getJardin() {
		return jardin;
	}
	public void setJardin(String jardin) {
		this.jardin = jardin;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}

	
	private int idmeetmed2;
	@JsonFormat(pattern = "yyyy-MM-dd" , shape = Shape.STRING)
	@Column(name =" datemeet")
	private String datemeet;
	private String  maladie;
	private String  description;
	private String  madecin;
	private String salle ;
	

	public Meetmedecin2(int idmeetmed2, String datemeet, String maladie, String description, String madecin, String salle,
			String enfant, String jardin, String classe) {
		super();
		this.idmeetmed2 = idmeetmed2;
		this.datemeet = datemeet;
		this.maladie = maladie;
		this.description = description;
		this.madecin = madecin;
		this.salle = salle;
		this.enfant = enfant;
		this.jardin = jardin;
		this.classe = classe;
	}





	private String  enfant;
	private String  jardin;
	private String  classe;
}


