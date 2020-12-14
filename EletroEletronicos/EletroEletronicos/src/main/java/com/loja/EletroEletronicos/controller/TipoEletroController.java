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

import com.loja.EletroEletronicos.model.TipoEletro;
import com.loja.EletroEletronicos.repository.TipoEletroRepository;

@RestController
@RequestMapping("/tipo")
@CrossOrigin(value="*", allowedHeaders="*")
public class TipoEletroController {
	@Autowired
	private TipoEletroRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<TipoEletro>> PegarTodos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoEletro> PegarPorID(@PathVariable int id){
		return repositorio.findById(id).map(n -> ResponseEntity.ok(n)).orElse(ResponseEntity.badRequest().build());
	}
	
	@PostMapping
	public ResponseEntity<TipoEletro> Criar(@RequestBody TipoEletro criado){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(criado));
	}
	
	@PutMapping
	public ResponseEntity<TipoEletro> Atualizar(@RequestBody TipoEletro atualizado){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(repositorio.save(atualizado));
	}

	@DeleteMapping("/{id}")
	public void DeletarPorID(@PathVariable int id) {
		repositorio.deleteById(id);
	}
}
