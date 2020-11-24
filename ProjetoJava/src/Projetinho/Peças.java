package Projetinho;

public class Pe�as 
{
	/* attributes */
	private String nome;
	private double valor;
	private String ID;
	private int unidades;
	/* constructor */
	public Pe�as(String ID, String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.ID = ID;
	}
	public Pe�as(String ID, String nome, double valor, int unidades) {
		this.nome = nome;
		this.valor = valor;
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
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String toString() {
		return "ID: "+ID+"\tPe�a: "+nome+"\tPre�o unit�rio: "+valor+" R$\n";
	}
}

