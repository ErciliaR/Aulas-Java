package com.loja.EletroEletronicos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoria")
public class Categoria {
	/* attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long categoriaId;
	
	@NotBlank
	@Size(min=2, max=50)
	@Column(name="descricao")
	private String categoriaDescricao;
	
	/* tables relationship */
	@OneToMany(mappedBy="categoriaObj", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("categoriaObj")
	private List<Produto> produtoObj;
	
	/* methods */
	public long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getCategoriaDescricao() {
		return categoriaDescricao;
	}

	public void setCategoriaDescricao(String categoriaDescricao) {
		this.categoriaDescricao = categoriaDescricao;
	}

	public List<Produto> getProdutoObj() {
		return produtoObj;
	}

	public void setProdutoObj(List<Produto> produtoObj) {
		this.produtoObj = produtoObj;
	}
}
