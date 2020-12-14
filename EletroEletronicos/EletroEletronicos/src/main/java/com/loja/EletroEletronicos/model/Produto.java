package com.loja.EletroEletronicos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_produto")
public class Produto {
	/* attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long produtoId;

	@NotBlank
	@Size(min=2, max=50)
	private String nome;
	
	@NotNull
	@Column(columnDefinition="Decimal(10,2)")
	private double preco;
	
	@NotNull
	@Min(0)
	private int quantidade;
	
	@NotBlank
	@Size(min=2, max=50)
	private String marca;
	
	/* tables relationship */
	@ManyToOne
	@JsonIgnoreProperties("produtoObj")
	private Categoria categoriaObj;
	
	@ManyToOne
	@JsonIgnoreProperties("produtosObj")
	private TipoEletro tipoEletroObj;
	
	/* methods */
	
	
	public long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(long produtoId) {
		this.produtoId = produtoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Categoria getCategoriaObj() {
		return categoriaObj;
	}

	public void setCategoriaObj(Categoria categoriaObj) {
		this.categoriaObj = categoriaObj;
	}

	public TipoEletro getTipoEletroObj() {
		return tipoEletroObj;
	}

	public void setTipoEletroObj(TipoEletro tipoEletroObj) {
		this.tipoEletroObj = tipoEletroObj;
	}
}
