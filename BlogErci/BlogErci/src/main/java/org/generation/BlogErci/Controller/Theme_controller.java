package org.generation.BlogErci.Controller;

import java.util.List;

import org.generation.BlogErci.Model.Theme;
import org.generation.BlogErci.Repository.Theme_repository;
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
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tema")

public class Theme_controller {
	@Autowired
	private Theme_repository repository;
	
	@GetMapping
	public ResponseEntity<List<Theme>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Theme> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Theme>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Theme> post (@RequestBody Theme tema){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(tema));
	}

	@PutMapping
	public ResponseEntity<Theme> put (@RequestBody Theme tema){
		return ResponseEntity.ok(repository.save(tema));				
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
