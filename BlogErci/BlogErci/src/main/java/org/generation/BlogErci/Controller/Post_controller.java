package org.generation.BlogErci.Controller;

import java.util.List;
import org.generation.BlogErci.Model.Post_model;
import org.generation.BlogErci.Repository.Post_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@CrossOrigin("*")
public class Post_controller {

	@Autowired
	private Post_repository repository;
	@GetMapping
	public ResponseEntity<List<Post_model>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Post_model> GetById(@PathVariable long id){
		return repository.findById(id).map(anwser -> ResponseEntity.ok(anwser)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/title/{title}")
	public ResponseEntity<List<Post_model>> GetByTitle(@PathVariable String title){
		return ResponseEntity.ok(repository.findAllBytitleContainingIgnoreCase(title));
	}
	@PostMapping
	public ResponseEntity<Post_model> Post(@RequestBody Post_model post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(post));
	}
	@PutMapping
	public ResponseEntity<Post_model> Put(@RequestBody Post_model put){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(put));
	}
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id){
		repository.deleteById(id);
	}
}
