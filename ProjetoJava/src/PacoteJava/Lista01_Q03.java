package PacoteJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Q03 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		/* variable */
		int a, b, c;
		double d;
		/* input */
		System.out.println("\nEntre com os valores inteiros positivos de: ");
		System.out.println("\nEntre com a variavel A: ");
		a = read.nextInt();
		System.out.println("\nEntre com a variavel B: ");
		b = read.nextInt();
		System.out.println("\nEntre com a variavel C: ");
		c = read.nextInt();
		/* calculate and output */
		if (a < 0 || b < 0 || c < 0 )
		{
			System.out.println("\nValor inválido.");
		} else {
			d = (Math.pow(a+b, 2) + Math.pow(b+c, 2)) / 2.0;
			System.out.println("\nO valor de D é: " + df.format(d) + ".");
		}
	}
}
