package PacoteJava;

import java.util.Scanner;

public class Lista01_Q05 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		int years, months, days, output;
		/* input */
		System.out.println("\nQual sua idade contando anos, meses e dias: ");
		System.out.println("\nEntre com n�mero de anos: ");
		years = read.nextInt();
		System.out.println("\nEntre com n�mero de meses: ");
		months = read.nextInt();
		System.out.println("\nEntre com n�mero de dias: ");
		days = read.nextInt();
		/* calculate and output */
		if (years < 0 || months < 0 || days < 0)
		{
			System.out.println("\nValor inv�lido.");
		} else {
			output = days + months * 30 + years * 365;
			System.out.println("\nSua idade em dias � de: " + output + ".");
		}
	}
}
