package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bus;
import com.example.demo.model.Meeting;

import com.example.demo.services.meetservice;

@RestController
@CrossOrigin("*")
public class meetcontroller {
	
	
	@Autowired
	private meetservice Meetservice ;
	
	//add meet
	
	@PostMapping(value="saveMeet")
	public Meeting saveMeet(@RequestBody Meeting meet) {
		System.out.println("Meet aded!");
		Meetservice.saveMeet(meet);
		
		return meet;
		
	
}
	
//update 
	
	@PutMapping("updateMeet")
	public Meeting updateMeet(@RequestBody Meeting meet ){
		return Meetservice.updateMeet(meet);
	}

	
	// show
	
	@GetMapping(value ="getAllmeets")
	public List<Meeting> findAllMeeting(){
		return Meetservice.findAllMeets();}



// delete 
	
	@DeleteMapping("deleteMeet")
	public String deleteMeet (@RequestParam int idmeet){
		Meetservice.deleteMeet(idmeet);
		return "Meet canceled!";

		
	}






}
