package Lista04;

import java.util.Scanner;

public class Lista04_Q05 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		int num, sum=0;
		/* input and calculate */
		do 
		{
			System.out.println("\nEntre com o n�mero: ");
			num = read.nextInt();
			if (num < 0)
				System.out.println("\nValor inv�lido.");
			else
				sum += num;
		} while (num != 0);
		/* output */
		System.out.println("\nA soma dos n�meros: " + sum + ".");
	}
}
