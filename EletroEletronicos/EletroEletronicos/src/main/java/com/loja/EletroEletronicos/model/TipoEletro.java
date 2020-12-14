package com.loja.EletroEletronicos.model;

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
@Table(name="tb_tipo_eletro")
public class TipoEletro {
	/* attributes */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@Size(min=2, max=50)
	private String descricao;
	
	@NotNull
	private boolean ativo;
	
	/* tables relationship */
	@OneToMany(mappedBy="tipoEletroObj", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("tipoEletroObj")
	private List<Produto> produtoObj;

	/* methods */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<Produto> getProdutoObj() {
		return produtoObj;
	}

	public void setProdutoObj(List<Produto> produtoObj) {
		this.produtoObj = produtoObj;
	}
}
