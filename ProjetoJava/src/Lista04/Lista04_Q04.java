package Lista04;

import java.util.Scanner;

public class Lista04_Q04 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		float num, sum=0;
		/* input and calculate */
		do
		{
			System.out.println("\nEntre com o n�mero: ");
			num = read.nextFloat();
			sum += num;
		} while (num != 0);
		/* output */
		System.out.println("\nA soma dos n�meros: " + sum + ".");
	}
}
