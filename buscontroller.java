package com.example.demo.controller;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.services.busservice;

import com.example.demo.model.Bus;
import com.example.demo.model.Bus2;



@RestController
@CrossOrigin("*")

public class buscontroller {


	@Autowired
	private busservice Busservice ;
	

	
	
	
	
	
	
	@PostMapping(value="saveBus")
	public Bus saveBus(@RequestBody Bus bus) {
		System.out.println("bus aded!");
		Busservice.saveBus(bus);
		
		return bus;}
		
	
	
	
	@PutMapping("updateBus")
	public Bus updateBus(@RequestBody Bus bus ){
		return Busservice.updateBus(bus);
	}
	
	
	
	
@GetMapping(value ="getAllBuses")
public List<Bus> findAllBus(){
	return Busservice.findAllBuses();}
	
	




@GetMapping(value ="getAllBuses/adresse/{adresse}")
public List<Bus> findByAdresse(@PathVariable String adresse){
	return Busservice.findByAdresse(adresse);}









@DeleteMapping("deleteBus")
public String deleteBus (@RequestParam int idbus){
	Busservice.deleteBus(idbus);
	return "bus deleted!";

	
}


	



}
