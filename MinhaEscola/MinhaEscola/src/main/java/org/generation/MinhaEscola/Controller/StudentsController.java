package org.generation.MinhaEscola.Controller;

import java.util.List;

import org.generation.MinhaEscola.Model.StudentsModel;
import org.generation.MinhaEscola.Repository.StudentsRepository;
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
@RequestMapping("/students")
@CrossOrigin(value="*", allowedHeaders="*" )
public class StudentsController {
	@Autowired
	private StudentsRepository repository;
	
	@GetMapping
	public ResponseEntity<List<StudentsModel>> getAllStudents(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<StudentsModel> postStudent(@RequestBody StudentsModel post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(post));
	}
	
	@PutMapping
	public ResponseEntity<StudentsModel> putStudent(@RequestBody StudentsModel put){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(repository.save(put));
	}
	
	@DeleteMapping("/{studentId}")
	public void DeleteStudent(@PathVariable long studentId) {
		repository.deleteById(studentId);
	}

}
