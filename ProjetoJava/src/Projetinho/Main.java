package Projetinho;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		/* objects */
		Estoque loja01 = new Estoque(0, null, 0);
		/* present options */
		System.out.println("\nLista de pe�as:\n");
		System.out.println("ID \t Nome \t Pre�o");
		loja01.adicionar();
		/* variables and set */
		Collection<Pe�as> compra = new HashSet<Pe�as>();
		int num, i=1, item;
		double total=0;
		/* client must add */
		while(i != 0 && i == 1) {
		System.out.println("Dentre as pe�as disponiveis, digite o ID da pe�as que deseja comprar:");
		item = ler.nextInt();
		System.out.println("Quantas unidades");
		num = ler.nextInt();
		
		// reconecer o id veriifcar o balanco final
		total += getValor();
		Pe�as pe�a = new Pe�as(item, num);
		compra.add(pe�a);
		System.out.println("Deseja adicionar outro item digite 1 se n�o digite 0: ");
		i = ler.nextInt();
		}
		/* show what client add */
		System.out.println(compra);
		/* show total balance */
		//Integer i = Integer.parseInt(Pe�as.getValor());
		//int soma = Pe�as.getValor() forEach(i -> i.sum());
		
				
		ler.close();
	}
}
