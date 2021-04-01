package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class comment implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idcomment;
	private String text;
	private String photo;
	private String reaction;
	
	@ManyToOne
	private Publication Publication;
	
	
	public Publication getPublication() {
		return Publication;
	}
	public void setPublication(Publication publication) {
		Publication = publication;
	}
	
	
	public Long getIdcomment() {
		return idcomment;
	}
	public void setIdcomment(Long idcomment) {
		this.idcomment = idcomment;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	



	
}
