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

import com.loja.EletroEletronicos.model.Produto;
import com.loja.EletroEletronicos.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(value="*", allowedHeaders="*")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Produto>> PegarTodos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{produtoId}")
	public ResponseEntity<Produto> PegarPorId(@PathVariable long produtoId){
		return repositorio.findById(produtoId).map(n -> ResponseEntity.ok(n)).orElse(ResponseEntity.badRequest().build());
	}
	
	@GetMapping("/porRange/{valor1}/{valor2}")
	public ResponseEntity<List<Produto>> PegarTodosRange(@PathVariable double valor1, @PathVariable double valor2){
		return ResponseEntity.ok(repositorio.RangePreco(valor1, valor2));
	}
	
	@GetMapping("/porTipo/{tipoId}/{valor}")
	public ResponseEntity<List<Produto>> PegarTodosRangeTipo(@PathVariable int tipoId, @PathVariable double valor){
		return ResponseEntity.ok(repositorio.RangePrecoTipo(tipoId, valor));
	}
	
	@PostMapping
	public ResponseEntity<Produto> Criar(@RequestBody Produto criado){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(criado));
	}
	
	@PutMapping
	public ResponseEntity<Produto> Atualizar(@RequestBody Produto atualizado){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(repositorio.save(atualizado));
	}
	
	@DeleteMapping("/{produtoId}")
	public void DeletarPorId(@PathVariable long produtoId) {
		repositorio.deleteById(produtoId);
	}
}
