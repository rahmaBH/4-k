package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class categorie implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCat;;
	private String NomCat;
	
	@OneToMany(mappedBy="categorie",cascade = CascadeType.REMOVE)
	private List<forum> Forum;
	
	
	public Long getIdCat() {
		return idCat;
	}
	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return NomCat;
	}
	public void setNomCat(String nomCat) {
		NomCat = nomCat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<forum> getForum() {
		return Forum;
	}
	public void setForum(List<forum> forum) {
		Forum = forum;
	};
	

	
	



	
}
