package Projetinho;

import java.util.Collection;
import java.util.HashSet;

public class Estoque extends Pe�as
{
	/* constructor */
	public Estoque(int ID, String nome, double valor) {
		super(ID, nome, valor);
	}
	/* method */
	public void adicionar() {
	Collection<Pe�as> estoque =new HashSet<Pe�as>();
	Pe�as I9=new Pe�as (1,"I9 10� Gera��o",15000);
	Pe�as I7=new Pe�as (2,"I7 10� Gera��o",15000);
	Pe�as I5=new Pe�as (3,"I5 10� Gera��o",15000);
	Pe�as RTX3=new Pe�as (4,"RTX 3090TI",50000);
	Pe�as RTX2=new Pe�as (5,"RTX 2080TI",12000);
	Pe�as RTX0=new Pe�as (6,"RTX 2060TI",2000);
	Pe�as a1tb=new Pe�as (7,"HDD 500GB + SSD nvme 500GB",1000);
	Pe�as a2tb=new Pe�as (8,"I9 10� Gera��o",15000);
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
