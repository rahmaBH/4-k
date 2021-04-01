package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bus;
import com.example.demo.model.Meeting;
import com.example.demo.model.Meetmedecin;
import com.example.demo.services.meetmedservice;
import com.example.demo.services.meetservice;

@RestController
@CrossOrigin("*")
public class meetmedcontroller {
	
	@Autowired
	private meetmedservice Meetmedservice ;

	
	
	@PostMapping(value="saveMeetmed")
	public Meetmedecin saveMeetmed(@RequestBody Meetmedecin meetmed) {
		System.out.println("Meet aded!");
		Meetmedservice.saveMeetmed(meetmed);
		
		return meetmed;
		
	
}
	
	
	@PutMapping("updateMeetmed")
	public Meetmedecin updateMeetmed(@RequestBody Meetmedecin meetmed ){
		return Meetmedservice.updateMeetmed(meetmed);
	}
	
	@GetMapping(value ="getAllmeetsmed")
	public List<Meetmedecin> findAllMeetmedecin(){
		return Meetmedservice.findAllMeetsmed();}
	
	
	@GetMapping(value ="getAllmeetsmed/datemeet/{datemeet}")
	public List<Meetmedecin> findByDatemeet(@PathVariable String datemeet){
		return Meetmedservice.findByDatemeet(datemeet);}
	
	
	
	
	@DeleteMapping("deleteMeetmed")
	public String deleteMeetmed (@RequestParam int idmeetmed){
		Meetmedservice.deleteMeet(idmeetmed);
		return "Meet canceled!";

		
	}
	
	
	
}
