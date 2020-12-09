package com.Farmacia.e_cormmerce.controller;

import java.util.List;

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

import com.Farmacia.e_cormmerce.model.Categoria;
import com.Farmacia.e_cormmerce.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(value="*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAllCategoria(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable long id){
		return repositorio.findById(id).map(n -> ResponseEntity.ok(n)).orElse(ResponseEntity.badRequest().build());
	}
	
	@PostMapping
	public ResponseEntity<Categoria> PostIT(@RequestBody Categoria post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(post));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> PutIT(@RequestBody Categoria put){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(put));
	}
	
	@DeleteMapping("/{id}")
	public void DeleteIT(@PathVariable long id) {
		repositorio.deleteById(id);
	}
        
}
