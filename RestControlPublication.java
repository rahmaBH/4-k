package com.example.demo.controller;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Publication;
import com.example.demo.model.User;
import com.example.demo.serviceinterface.IPublicationService;
import com.example.demo.services.MailService;







@RestController
public class RestControlPublication {

	@Autowired
	IPublicationService publicationservice;
	@Autowired
	MailService servicemail;
	User u = new User();
	
	
	
	 // URL : http://localhost:8081/SpringMVC/servlet/getAllEmployes
	@GetMapping(value = "/getAllpublication")
    @ResponseBody
	public List<Publication> getAllPublication() {
		
		return publicationservice.getAllPublication();
	}
	
	@PostMapping("/ajouterPub")
	@ResponseBody
	public Publication ajouterForum(@RequestBody Publication p)throws AddressException, MessagingException, IOException 
	{	u.setUseremail("aymen.baghouli@esprit.tn");
		publicationservice.ajouterPublication(p);
		servicemail.sendmail(p.getText(),u.getUseremail());
	    
		return p;
	}
	
	
	@DeleteMapping("/deletePublicationById/{idpub}") 
	@ResponseBody 
	public void deleteForumById(@PathVariable("idpub")Long idpub) {
		publicationservice.deletePublication(idpub);
	}
	
	@PutMapping(value = "/mettreAjourPublicationById/{id}/{text}/{photo}") 
 	@ResponseBody
	public void mettreAjourPublicationById(@PathVariable("text") String text, @PathVariable("id") Long id, @PathVariable("photo") String photo) {	
	publicationservice.mettreAjourPublicationByIdJPQL(text, id, photo);
		
	}
	
	@PutMapping(value = "/affecterPublicationAForum/{idpub}/{idforum}") 
	public void affecterEmployeADepartement(@PathVariable("idpub")Long idpub, @PathVariable("idforum")Long idforum) {
		publicationservice.affecterPublicationAForum(idpub ,idforum);
		
	}

	  @GetMapping(value = "getAllPublicationByAll/{text}")
	    @ResponseBody
		public List<Publication> getAllByAll(@PathVariable("text") String text) {

	  
	    	return publicationservice.getAllByAll(text);
		}

	
	  //trie descendant
	   @GetMapping(value = "/triPubByDaTE")
	    @ResponseBody
		public List<Publication> TriByDate() {

	    	return publicationservice.triDate();
		}
	

	/*    @RequestMapping(value = "/pdfreport", method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_PDF_VALUE)
	    public ResponseEntity<InputStreamResource> citiesReport() {

	        List<Publication> pubs = (List<Publication>) publicationservice.pdf();

	      ByteArrayInputStream bis = pdf.citiesReport(pubs);

	        HttpHeaders headers = new HttpHeaders();
	        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

	        return ResponseEntity
	                .ok()
	                .headers(headers)
	                .contentType(MediaType.APPLICATION_PDF)
	                .body(new InputStreamResource(bis));
	    }*/
}
