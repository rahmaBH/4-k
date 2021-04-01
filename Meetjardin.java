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
@Table(name= "Meetjardin",catalog = "jardin")
public class Meetjardin {
	

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private int idmeetjardin;
	public Meetjardin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Meetjardin(int idmeetjardin, String datemeetjardin, String jardin, String sujet, String parent) {
		super();
		this.idmeetjardin = idmeetjardin;
		this.datemeetjardin = datemeetjardin;
		this.jardin = jardin;
		this.sujet = sujet;
		this.parent = parent;
	}
	public int getIdmeetjardin() {
		return idmeetjardin;
	}
	public void setIdmeetjardin(int idmeetjardin) {
		this.idmeetjardin = idmeetjardin;
	}
	public String getDatemeetjardin() {
		return datemeetjardin;
	}
	public void setDatemeetjardin(String datemeetjardin) {
		this.datemeetjardin = datemeetjardin;
	}
	public String getJardin() {
		return jardin;
	}
	public void setJardin(String jardin) {
		this.jardin = jardin;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	@JsonFormat(pattern = "yyyy-MM-dd" , shape = Shape.STRING)
	@Column(name =" datemeet")
	private String datemeetjardin;
	private String  jardin;
	private String  sujet;
	private String  parent;

}
