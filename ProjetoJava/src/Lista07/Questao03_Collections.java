package Lista07;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Questao03_Collections 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		int num=0, b;
		String a;
		/* collection */
		Collection<Questao03_Collection_ClassProduct> storage = new HashSet<Questao03_Collection_ClassProduct>();
		/* inputs */
		while (num<=0) {
		System.out.println("Entre com o numéro total dos produtos vedindos (NÃO A QUANTIDADE): ");
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
		/* first output */
		System.out.println();
		System.out.println(storage);
		/* remove IF */
		storage.removeIf(n -> (n.quantity <= 0));
		/* second output */
		System.out.println();
		System.out.println(storage);
	}
}
