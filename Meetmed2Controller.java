/*package com.example.demo.controller;



import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Meetmedecin2;

import com.example.demo.repository.meetmedc2repo;
import com.twilio.base.Page;

@RestController
public class Meetmed2Controller {
	
	@Autowired
	private meetmedc2repo  employeeData;
	
	@RequestMapping(value = "/listPageable", method = RequestMethod.GET)
	List<Meetmedecin2> meetsPageable(Pageable pageable) {
		
		return employeeData.findAll(pageable);
	}

}*/
