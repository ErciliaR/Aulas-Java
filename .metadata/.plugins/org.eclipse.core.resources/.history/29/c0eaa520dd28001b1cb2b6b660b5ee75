package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista02_Q03 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		/* variables */
		double a, b, c, d;
		/* input */
		System.out.println("\nEntre com quatro números.");
		System.out.println("\nPrimeiro número: ");
		a = read.nextDouble();
		System.out.println("\nSegundo número: ");
		b = read.nextDouble();
		System.out.println("\nTerceiro número: ");
		c = read.nextDouble();
		System.out.println("\nQuarto número: ");
		d = read.nextDouble();
		/*calculate and output*/
		if (Math.pow(c, 2) >= 1000)
		{
			System.out.println("\nO valor do quadrado do terceiro número é " + df.format(Math.pow(c, 2)) + ".");
		} else {
			System.out.println("\nO primeiro número é " + df.format(a) + " e o seu quadrado é " + df.format(Math.pow(a, 2)) + ".");
			System.out.println("\nO segundo número é " + df.format(b) + " e o seu quadrado é " + df.format(Math.pow(b, 2)) + ".");
			System.out.println("\nO terceiro número é " + df.format(c) + " e o seu quadrado é " + df.format(Math.pow(c, 2)) + ".");
			System.out.println("\nO quarto número é " + df.format(d) + " e o seu quadrado é " + df.format(Math.pow(d, 2)) + ".");
		}
	}
}
