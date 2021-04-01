package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Event implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private String Description;
   
	
	@Temporal(TemporalType.DATE)
	private Date AddDate;
	private String Location;
	@OneToMany(mappedBy="event")
	private List<Donation> donation;
	
	@OneToMany(mappedBy="event")
	private List<jackpot> jackpot;
	


	@ManyToMany
	private List<User> user;
	
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public List<Donation> getDonation() {
		return donation;
	}
	public void setDonation(List<Donation> donation) {
		this.donation = donation;
	}
	public List<jackpot> getJackpot() {
		return jackpot;
	}
	public void setJackpot(List<jackpot> jackpot) {
		this.jackpot = jackpot;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getAddDate() {
		return AddDate;
	}
	public void setAddDate(Date addDate) {
		AddDate = addDate;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

	
	



	
}
