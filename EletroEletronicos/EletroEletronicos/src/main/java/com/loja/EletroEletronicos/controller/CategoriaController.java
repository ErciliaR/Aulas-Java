package com.loja.EletroEletronicos.controller;

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

import com.loja.EletroEletronicos.model.Categoria;
import com.loja.EletroEletronicos.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(value="*", allowedHeaders="*")
public class CategoriaController {
	@Autowired
	private CategoriaRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> PegarTodos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{categoriaId}")
	public ResponseEntity<Categoria> PegarPorID(@PathVariable long categoriaId){
		return repositorio.findById(categoriaId).map(n -> ResponseEntity.ok(n)).orElse(ResponseEntity.badRequest().build());
	}

	@PostMapping
	public ResponseEntity<Categoria> Criar(@RequestBody Categoria criado){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(criado));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> Atualizar(@RequestBody Categoria atualizado){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(repositorio.save(atualizado));
	}
	
	@DeleteMapping("/{categoriaId}")
	public void DeletePorId(@PathVariable long categoriaId){
		repositorio.deleteById(categoriaId);
	}
}
