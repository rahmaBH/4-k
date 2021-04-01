package com.example.demo.controller;

import java.util.Date;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.categorie;
import com.example.demo.serviceinterface.ICategorieService;






@RestController
public class RestControlCategorie {

	@Autowired
	ICategorieService categorieservice;
	
	 // URL : http://localhost:8081/SpringMVC/servlet/getAllEmployes
	@GetMapping(value = "/getAllCategorie")
    @ResponseBody
	public List<categorie> getAllCategories() {
		
		return categorieservice.getAllCategories();
	}

	
	@PostMapping("/ajouterCategorie")
	@ResponseBody
	public categorie ajouterCategorie(@RequestBody categorie c)
	{
		categorieservice.ajouterCategorie(c);
		return c;
	}
	
	@DeleteMapping("/deleteCategorieById/{idc}") 
	@ResponseBody 
	public void deleteCategorieById(@PathVariable("idc")Long idc) {
		categorieservice.deleteCategorie(idc);
	}
	
	 // Modifier email : http://localhost:8081/SpringMVC/servlet/mettreAjourEmailByEmployeIdJPQL/2/newemail
 	@PutMapping(value = "/mettreAjourNomCatById/{id}/{nomcat}") 
 	@ResponseBody
	public void mettreAjourNomCatById(@PathVariable("nomcat") String nomcat, @PathVariable("id") Long id) {	
	categorieservice.mettreAjourNomcatByIdJPQL(nomcat, id);
		
	}
 	
 	//stat
	@GetMapping(value = "/nbreforum")
    @ResponseBody
	public int getnbreforum() {
		
		 return categorieservice.getNombreForumJPQL();
	}
    @GetMapping(value = "recherche/{nomCat}")
    @ResponseBody
	public categorie recherche(@PathVariable("nomCat") String nomCat) {

  
    	return categorieservice.getMyCategorie(nomCat);
	}
	
	
	
	
 	
	
}
