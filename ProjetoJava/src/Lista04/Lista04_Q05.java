package Lista04;

import java.util.Scanner;

public class Lista04_Q05 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		int num, sum=0, i=0;
		/* input and calculate */
		do 
		{
			System.out.println("\nEntre com o n�mero: ");
			num = read.nextInt();
			if ((num % 3) == 0 && num != 0) 
			{
				sum += num;
				i++;
			}
		} while (num != 0);
		/* output */
		System.out.println("\nA m�dia dos n�meros m�ltiplos de 3: " + (sum/i) + ".");
	}
}
