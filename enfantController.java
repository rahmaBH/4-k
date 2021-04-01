package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceinterface.ICommentService;
import com.example.demo.serviceinterface.enfantinterface;
import com.example.demo.services.enfantservice;

@RestController
public class enfantController {
	@Autowired
	enfantinterface CommentService;
	
	
	@PutMapping(value = "/affecterEnfantABus/{ide}/{idbus}") 
	public void affecterEnfantABus(@PathVariable("ide") int ide,@PathVariable("idbus")int idbus) {
		CommentService.affecterEnfantABus(ide,idbus );
		
	}
	
	
	
}
