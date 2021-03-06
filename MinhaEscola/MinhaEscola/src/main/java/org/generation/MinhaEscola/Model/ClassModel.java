 package org.generation.MinhaEscola.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "Class")
public class ClassModel {
	/* attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 2 , max = 100)
	private String classId;
	
	@NotNull
	private boolean active;
	
	@OneToMany(mappedBy="class", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("class")
	private List<StudentsModel> students;
	/* constructor */
		
	/* methods */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClassID() {
		return classId;
	}
	public void setClassID(String classId) {
		this.classId = classId;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
