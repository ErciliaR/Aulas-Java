package Lista04;

import java.util.Scanner;

public class Lista04_Q11 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		float num=0 , sum=0;
		/* input */
		while (num <= 0)
		{
			System.out.println("\nEntre com o número: ");
			num = read.nextFloat();
		}		
		/* calculate */
		do
		{
			sum += num;
			num--;
		} while (num > 0);
		/* output */
		System.out.println("\nA soma dos números: " + sum + ".");
	}
}
