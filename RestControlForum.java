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

import com.example.demo.model.forum;
import com.example.demo.repository.CategorieRepository;
import com.example.demo.serviceinterface.IForumService;




@RestController
public class RestControlForum {

	@Autowired
	IForumService forumservice;
	

	@Autowired
	CategorieRepository catrep;
	
	 // URL : http://localhost:8081/SpringMVC/servlet/getAllEmployes
	@GetMapping(value = "/getAllForms")
    @ResponseBody
	public List<forum> getAllforum() {
		
		return forumservice.getAllForums();
	}
	
	
	@PostMapping("/ajouterForum")
	@ResponseBody
	public forum ajouterForum(@RequestBody forum f)
	{
		forumservice.ajouterForum(f);
		return f;
	}
	
	@DeleteMapping("/deleteForumById/{idf}") 
	@ResponseBody 
	public void deleteForumById(@PathVariable("idf")Long idf) {
		forumservice.deleteForumById(idf);
	}
	
	@PutMapping(value = "/mettreAjourForumById/{id}/{description}/{title}/{pic}") 
 	@ResponseBody
	public void mettreAjourNomCatById(@PathVariable("description") String description, @PathVariable("id") Long id,@PathVariable("title") String title , @PathVariable("pic") String pic) {	
	forumservice.mettreAjourForumByIdJPQL(description, id,title, pic);
		
	}
	
	@PutMapping(value = "/affecterForumACategorie/{idforum}/{idcat}") 
	public void affecterEmployeADepartement(@PathVariable("idforum")Long idforum, @PathVariable("idcat")Long idcat) {
		forumservice.affecterForumACategorie(idforum, idcat);
		
	}
	
	
	    @GetMapping(value = "getAllforumByCategorie/{nomCat}")
	    @ResponseBody
		public List<forum> getAllChildrenByParent(@PathVariable("nomCat") String nomCat) {

	  
	    	return forumservice.getMyChild(nomCat);
		}
		
		
	    @GetMapping(value = "getAllforumByAll/{text}")
	    @ResponseBody
		public List<forum> FindAllByAll(@PathVariable("text") String text) {

	  
	    	return forumservice.getAllByAll(text);
		}
		    //trie descendant
		   @GetMapping(value = "/triByDaTE")
		    @ResponseBody
			public List<forum> TriByDate() {

		    	return forumservice.triDate();
			}
		

	
	
}
