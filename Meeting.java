package com.example.demo.model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Columns;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name= "Meeting",catalog = "jardin")

public class Meeting {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	
	/*@ManyToMany
	private List<kinder> kinder;*/
	

	public int getIdmeet() {
		return idmeet;
	}

	public void setIdmeet(int idmeet) {
		this.idmeet = idmeet;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}





	




	public String getDatemeet() {
		return datemeet;
	}

	public void setDatemeet(String datemeet) {
		this.datemeet = datemeet;
	}

	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meeting(int idmeet, String datemeet, String subject, String description, String sender, String receiver) {
		super();
		this.idmeet = idmeet;
		this.datemeet = datemeet;
		this.subject = subject;
		this.description = description;
		this.sender = sender;
		this.receiver = receiver;
	}










	private int idmeet;
	@JsonFormat(pattern = "yyyy-MM-dd" , shape = Shape.STRING)
	@Column(name =" datemeet")
	private String datemeet;
	private String  subject;
	private String  description;
	private String  sender;
	private String classe;
	public Meeting(String classe, String enfant, String bureau, String jardin) {
		super();
		this.classe = classe;
		this.enfant = enfant;
		this.bureau = bureau;
		this.jardin = jardin;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getEnfant() {
		return enfant;
	}

	public void setEnfant(String enfant) {
		this.enfant = enfant;
	}

	public String getBureau() {
		return bureau;
	}

	public void setBureau(String bureau) {
		this.bureau = bureau;
	}

	public String getJardin() {
		return jardin;
	}

	public void setJardin(String jardin) {
		this.jardin = jardin;
	}










	private String  enfant;
	private String  bureau;
	private String  jardin;

	private String  receiver;

}
