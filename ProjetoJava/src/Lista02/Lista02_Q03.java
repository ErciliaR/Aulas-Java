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
		System.out.println("\nEntre com quatro n�meros.");
		System.out.println("\nPrimeiro n�mero: ");
		a = read.nextDouble();
		System.out.println("\nSegundo n�mero: ");
		b = read.nextDouble();
		System.out.println("\nTerceiro n�mero: ");
		c = read.nextDouble();
		System.out.println("\nQuarto n�mero: ");
		d = read.nextDouble();
		/*calculate and output*/
		if (Math.pow(c, 2) >= 1000)
		{
			System.out.println("\nO valor do quadrado do terceiro n�mero � " + df.format(Math.pow(c, 2)) + ".");
		} else {
			System.out.println("\nO primeiro n�mero � " + df.format(a) + " e o seu quadrado � " + df.format(Math.pow(a, 2)) + ".");
			System.out.println("\nO segundo n�mero � " + df.format(b) + " e o seu quadrado � " + df.format(Math.pow(b, 2)) + ".");
			System.out.println("\nO terceiro n�mero � " + df.format(c) + " e o seu quadrado � " + df.format(Math.pow(c, 2)) + ".");
			System.out.println("\nO quarto n�mero � " + df.format(d) + " e o seu quadrado � " + df.format(Math.pow(d, 2)) + ".");
		}
	}
}
