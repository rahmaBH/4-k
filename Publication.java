package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Publication implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPub;
	private String text;
	private String Photo;
	@Temporal(TemporalType.DATE)
	private Date DatePub;
	
	@ManyToOne
	private forum forum;
	
	public List<comment> getComment() {
		return comment;
	}
	public void setComment(List<comment> comment) {
		this.comment = comment;
	}
	@OneToMany(mappedBy="Publication",cascade = CascadeType.REMOVE)
	private List<comment> comment;
	
	public forum getForum() {
		return forum;
	}
	public void setForum(forum forum) {
		this.forum = forum;
	}
	public Long getIdPub() {
		return idPub;
	}
	public void setIdPub(Long idPub) {
		this.idPub = idPub;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public Date getDatePub() {
		return DatePub;
	}
	public void setDatePub(Date datePub) {
		DatePub = datePub;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	


	

	
	



	
}
