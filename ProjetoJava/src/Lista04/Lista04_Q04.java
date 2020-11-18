package Lista04;

import java.util.Scanner;

public class Lista04_Q04 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		float num = 1, sum=0;
		/* input and calculate */
		do
		{
			do
			{
			System.out.println("\nEntre com o número: ");
			num = read.nextFloat();
			if (num < 0)
				System.out.println("\nValor inválido. Digite novamente...");
			} while (num<0);
			sum += num;
		} while (num > 0);
		/* output */
		System.out.println("\nA soma dos números: " + sum + ".");
	}
}
