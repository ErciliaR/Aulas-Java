package Lista04;

import java.util.Scanner;

public class Lista04_Q02 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		double [] n = {0,0,0,0,0,0,0,0,0,0};
		int odd=0, even=0;
		/* input and calculate */
		for (int i = 0; i < 10; i++)
		{
			System.out.println("\nEntre com o número" + (i+1) + ": ");
			n[i] = read.nextDouble();
			if(n[i]%2==0)
				odd++;
			else
				even++;
		}
		/* output */
		System.out.println("\nO total de números pares adicionados: " + odd + ".");
		System.out.println("\nO total de números impares adicionados: " + even + ".");
	}
}
