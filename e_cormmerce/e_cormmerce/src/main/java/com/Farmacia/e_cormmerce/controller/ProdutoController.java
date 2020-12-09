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

import com.Farmacia.e_cormmerce.model.Produto;
import com.Farmacia.e_cormmerce.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetAllProduto(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetByID(@PathVariable long id){
		return repositorio.findById(id).map(n -> ResponseEntity.ok(n)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Produto> PostIT(@RequestBody Produto post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(post));
	}
	
	@PutMapping
	public ResponseEntity<Produto> PutIT(@RequestBody Produto put){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(put));
	}
	
	@DeleteMapping("/{id}")
	public void DeleteIT(@PathVariable long id) {
		repositorio.deleteById(id);
	}
}
