package Lista03;

import java.util.Scanner;

public class Lista03_Q01 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		float a=0, b=0;
		/* input */
		while (a == b)
		{
		System.out.println("\nEntre com dois números.");
		System.out.println("\nPrimeiro número:");
		a = read.nextFloat();
		System.out.println("\nSegundo número:");
		b = read.nextFloat();
		}
		/* calculate and output */
		if (a > b)
		{
			System.out.println("\n O primeiro valor " + a + " é maior que o segundo valor " + b + ".");
		} else {
			System.out.println("\n O primeiro valor " + a + " é menor que o segundo valor " + b + ".");
		}
	}
}
