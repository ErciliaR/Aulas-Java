package Projetinho;

import java.util.Collection;
import java.util.HashSet;

public class Estoque extends Peças
{
	/* constructor */
	public Estoque(int ID, String nome, double valor) {
		super(ID, nome, valor);
	}
	/* method */
	public void adicionar() {
	Collection<Peças> estoque =new HashSet<Peças>();
	Peças I9=new Peças (1,"I9 10º Geração",15000);
	Peças I7=new Peças (2,"I7 10º Geração",15000);
	Peças I5=new Peças (3,"I5 10º Geração",15000);
	Peças RTX3=new Peças (4,"RTX 3090TI",50000);
	Peças RTX2=new Peças (5,"RTX 2080TI",12000);
	Peças RTX0=new Peças (6,"RTX 2060TI",2000);
	Peças a1tb=new Peças (7,"HDD 500GB + SSD nvme 500GB",1000);
	Peças a2tb=new Peças (8,"I9 10º Geração",15000);
	estoque.add(I9);
	estoque.add(I7);
	estoque.add(I5);
	estoque.add(RTX3);
	estoque.add(RTX2);
	estoque.add(RTX0);
	estoque.add(a1tb);
	estoque.add(a2tb);
	System.out.println(estoque);
	}
	public
}
