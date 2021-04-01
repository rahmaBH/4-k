package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class forum implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id ;
	private String title;
	private String pic;
	private String description;
	
	@Enumerated(EnumType.STRING)
	//@NotNull
	private Typeforum typeforum;
	
	@ManyToOne
	private categorie categorie;
	
	public List<Publication> getPublication() {
		return Publication;
	}
	public void setPublication(List<Publication> publication) {
		Publication = publication;
	}
	@OneToMany(mappedBy="forum",cascade = CascadeType.REMOVE)
	private List<Publication> Publication;
	
	@ManyToMany
	private List<User> user;

	public Typeforum getTypeforum() {
		return typeforum;
	}
	public void setTypeforum(Typeforum typeforum) {
		this.typeforum = typeforum;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	@Temporal(TemporalType.DATE)
	private Date CreateDate;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(categorie categorie) {
		this.categorie = categorie;
	}

	
	
	
	

	

	
	



	
}
