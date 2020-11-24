package Projetinho;

public class Peças 
{
	/* attributes */
	private String nome;
	private double valor;
	private int ID;
	private int unidades;
	/* constructor */
	public Peças(int ID, String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.ID = ID;
	}
	public Peças (int ID, int unidades) {
		this.ID = ID;
		this.unidades = unidades;
	}
	/* methods */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String toString() {
		return "ID: "+ID+"\tPeça: "+nome+"\tPreço: "+valor+" R$\n";
	}
	public double isBalance() {
		
	}
	
}

