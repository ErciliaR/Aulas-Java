package Lista07;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Questao03_Collections 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		Set<Questao03_Collection_ClassProduct> storage = new HashSet<Questao03_Collection_ClassProduct>();
		int num=0, b;
		String a;
		while (num<=0) {
		System.out.println("Entre com o numéro total dos distintos produtos (NÃO A QUANTIDADE): ");
		num = read.nextInt();
		}
		for (int i=0; i< num; i++) {
			System.out.println("Entre com o nome do produto: ");
			a = read.next();
			System.out.println("Entre com o quantidade do produto: ");
			b = read.nextInt();
			Questao03_Collection_ClassProduct product = new Questao03_Collection_ClassProduct (a, b);
			storage.add(product);
		}
		read.close();
		System.out.println(storage);
	}
}
