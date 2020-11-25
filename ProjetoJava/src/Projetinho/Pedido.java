package Projetinho;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pedido
{
	private Scanner ler;
	public void AdicionarItem() {
		/* mapping storage */
		Map<String, Peças> mapa = new TreeMap<String, Peças>();
		Peças A1 = new Peças ("A1","I9 10º Geração",3000);
		Peças A2 = new Peças ("A2","I7 10º Geração",4000);
		Peças A3 = new Peças ("A3","I5 10º Geração",1500);
		Peças A4 = new Peças ("A4","RTX 3090TI",5000);
		Peças A5 = new Peças ("A5","RTX 2080TI",1200);
		Peças A6 = new Peças ("A6","RTX 2060TI",2000);
		Peças A7 = new Peças ("A7","HDD 500GB + SSD nvme 500GB",1000);
		Peças A8 = new Peças ("A8","HDD 1T + SDD nvme 1T",3000);
		mapa.put("A1", A1);
		mapa.put("A2", A2);
		mapa.put("A3", A3);
		mapa.put("A4", A4);
		mapa.put("A5", A5);
		mapa.put("A6", A6);
		mapa.put("A7", A7);
		mapa.put("A8", A8);
		/* present options */
		Collection<Peças> estoque = mapa.values();
		System.out.println("\nLista de peças:\n");
		for(Peças x:estoque)
			System.out.println(x);
		ler = new Scanner(System.in);
		int num, i=1;
		String item;
		double total=0;
		/* client must add */
		Collection<Peças> compra = new HashSet<Peças>();
		while(i == 1) {
		System.out.println("Dentre as peças disponiveis, digite o ID da peças que deseja comprar:");
		item = ler.next();
		System.out.println("Quantas unidades");
		num = ler.nextInt();
		Peças peça = mapa.get(item) ; // ADICIONAR VERIFICAÇAO
		peça.setUnidades(num);
		compra.add(peça);
		System.out.println("Deseja adicionar outro item digite 1 se não digite 0: ");
		i = ler.nextInt();
		}
		/* show what client add */
		for(Peças x:compra) {
			System.out.println(x + "\tQuantidade: " + x.getUnidades());
			total += x.getValor()*x.getUnidades();
		}
		/* show total balance */
		System.out.println("Valor total da compra (FRETE GRÁTIS PRA TODO BRASIL): " + total + " R$.");  
		System.out.println("A expectativa de entrega é de no máximo 30 dias.");
		}
		/* method to confirm items */
	public void Confirmar() {
	    ler = new Scanner(System.in);
	    int i=2;
	    while(i!=1 && i!=0) {
		System.out.println("Se voce deseja CONFIRMAR lista de compra pressione 1, caso contrario 0: ");
		i = ler.nextInt();
	    }
	    switch (i) {
		case 0:
			System.out.println("\nA lista de compras foi CANCELADA.");
			System.exit(0);
		case 1:
			System.out.println("\nA lista de compras foi CONFIRMADA.");
		}
	}
}
