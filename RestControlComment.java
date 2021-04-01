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

import com.example.demo.model.comment;
import com.example.demo.serviceinterface.ICommentService;





@RestController
public class RestControlComment {

	@Autowired
	ICommentService CommentService;
	
	 // URL : http://localhost:8081/SpringMVC/servlet/getAllEmployes
	@GetMapping(value = "/getAllComment")
    @ResponseBody
	public List<comment> getAllComments() {
		
		return CommentService.getAllComments();
	}
	
	@PostMapping("/ajouterComment")
	@ResponseBody
	public comment ajouterForum(@RequestBody comment p)
	{
		CommentService.ajouterComment(p);
		return p;
	}
	
	
	@DeleteMapping("/deleteCommentById/{idcomment}") 
	@ResponseBody 
	public void deleteCommentById(@PathVariable("idcomment")Long idcomment) {
		CommentService.deleteCommentById(idcomment);
	}
	
	@PutMapping(value = "/mettreAjourCommentById/{id}/{texte}/{photo}/{reaction}") 
 	@ResponseBody
	public void mettreAjourCommentById(@PathVariable("texte") String texte, @PathVariable("id") Long id, @PathVariable("photo") String photo, @PathVariable("reaction") String reaction) {	
	CommentService.mettreAjourCommentById(texte, id , photo , reaction );
	
	}
 	
	@PutMapping(value = "/affecterCommentAPublication/{idcomment}/{idPub}") 
	public void affecterEmployeADepartement(@PathVariable("idcomment") Long idcomment,@PathVariable("idPub")Long idPub) {
		CommentService.affecterCommentAPublication(idcomment,idPub );
		
	}
	
	

}
