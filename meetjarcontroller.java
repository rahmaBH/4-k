package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Meeting;
import com.example.demo.model.Meetjardin;

import com.example.demo.repository.meetjarrepo;
import com.example.demo.services.meetjarservice;
import com.example.demo.services.meetservice;
import com.twilio.base.Page;

@RestController
@CrossOrigin("*")
public class meetjarcontroller {
	
	
	@Autowired
	private meetjarservice Meetjarservice ;
	
	


	
	//add meet
	
	@PostMapping(value="saveMeetjar")
	public Meetjardin saveMeetjar(@RequestBody Meetjardin meetjar) {
		System.out.println("Meet aded!");
		Meetjarservice.saveMeetjar(meetjar);
		
		return meetjar;
		
	
}
	
//update 
	
	@PutMapping("updateMeetjar")
	public Meetjardin updateMeetjar(@RequestBody Meetjardin meetjar ){
		return Meetjarservice.updateMeetjar(meetjar);
	}

	
	// show
	
	@GetMapping(value ="getAllmeetsjar")
	public List<Meetjardin> findAllMeetjardin(){
		return Meetjarservice.findAllMeetsjar();}



// delete 
	
	@DeleteMapping("deleteMeetjar")
	public String deleteMeetjar (@RequestParam int idmeetjar){
		Meetjarservice.deleteMeetjar(idmeetjar);
		return "Meet canceled!";

		
	}






}
