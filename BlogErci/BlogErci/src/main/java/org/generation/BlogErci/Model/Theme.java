package org.generation.BlogErci.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_theme")
public class Theme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String descricao;
	@OneToMany(mappedBy = "thema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("thema")
	private List<Post_model> post;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescriçao() {
		return descricao;
	}

	public void setDescriçao(String descriçao) {
		this.descricao = descriçao;
	}

	public List<Post_model> getPost() {
		return post;
	}

	public void setPost(List<Post_model> post) {
		this.post = post;
	}

	
}
