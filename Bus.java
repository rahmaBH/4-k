package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "Bus",catalog = "jardin")

public class Bus {

	@Id
	 @GeneratedValue(strategy= GenerationType.AUTO)
	private int idbus;
	
	
	@OneToMany 
	private List<Enfannt> Enfannt;
	public List<Enfannt> getEnfannt() {
		return Enfannt;
	}
	public void setEnfannt(List<Enfannt> Enfannt) {
		this.Enfannt = Enfannt;
	}
	
	
	
	
	
	
	
	public int getIdbus() {
		return idbus;
	}
	public void setIdbus ( int idbus) {
		this.idbus = idbus;
	}
	public int getNumserie() {
		return numserie;
	}
	public void setNumserie(int numserie) {
		this.numserie = numserie;
	}
	public String getNomchauffeur() {
		return nomchauffeur;
	}
	public void setNomchauffeur(String nomchauffeur) {
		this.nomchauffeur = nomchauffeur;
	}
	public int getNumchauffeur() {
		return numchauffeur;
	}
	public void setNumchauffeur(int numchauffeur) {
		this.numchauffeur = numchauffeur;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Bus(int idbus, int numserie, String nomchauffeur, int numchauffeur, String adresse) {
		super();
		this.idbus = idbus;
		this.numserie = numserie;
		this.nomchauffeur = nomchauffeur;
		this.numchauffeur = numchauffeur;
		this.adresse = adresse;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int numserie;
	private String nomchauffeur;
	private int numchauffeur;
	private String adresse;
	private String jardin;
	private String station;
	private String disatnce;
	private String départ;
	private String tempstrajet;
	private String nombus;
	public Bus(String jardin, String station, String disatnce, String départ, String tempstrajet, String nombus) {
		super();
		this.jardin = jardin;
		this.station = station;
		this.disatnce = disatnce;
		this.départ = départ;
		this.tempstrajet = tempstrajet;
		this.nombus = nombus;
	}
	public String getJardin() {
		return jardin;
	}
	public void setJardin(String jardin) {
		this.jardin = jardin;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getDisatnce() {
		return disatnce;
	}
	public void setDisatnce(String disatnce) {
		this.disatnce = disatnce;
	}
	public String getDépart() {
		return départ;
	}
	public void setDépart(String départ) {
		this.départ = départ;
	}
	public String getTempstrajet() {
		return tempstrajet;
	}
	public void setTempstrajet(String tempstrajet) {
		this.tempstrajet = tempstrajet;
	}
	public String getNombus() {
		return nombus;
	}
	public void setNombus(String nombus) {
		this.nombus = nombus;
	}
	
	
}
