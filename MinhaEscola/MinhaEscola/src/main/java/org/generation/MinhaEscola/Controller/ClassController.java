package org.generation.MinhaEscola.Controller;

import java.util.List;
import org.generation.MinhaEscola.Model.ClassModel;
import org.generation.MinhaEscola.Repository.ClassRepository;
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
@RequestMapping("/class")
@CrossOrigin("*")
public class ClassController {
	@Autowired
	private ClassRepository repository;
	@GetMapping
	public ResponseEntity<List<ClassModel>> GetAllClasses(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/classes/{classId}")
	public ResponseEntity<List<ClassModel>> GetClass(@PathVariable String classId){
		return ResponseEntity.ok(repository.findAllByClassIdContainingIgnoreCase(classId));
	}
	@GetMapping("/{id}")
	public ResponseEntity<ClassModel> GetById(@PathVariable long id){
		return repository.findById(id).map(anwser -> ResponseEntity.ok(anwser)).orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<ClassModel> Post(@RequestBody ClassModel post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(post));
	}
	@PutMapping
	public ResponseEntity<ClassModel> Put(@RequestBody ClassModel put){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(put));
	}
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
