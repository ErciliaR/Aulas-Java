package Lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista04_Q08 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		/* variables */
		double num=0, sum=0;
		int total=0;
		/* input and calculate */
		while (num >= 0)
		{
			System.out.println("\nEntre com o n�mero positivo: ");
			num = read.nextDouble();
			if (num >= 0)
			{
				sum+=num;
				total++;
			}
		}
		/* output */
		System.out.println("\nA soma dos n�mero adicionados: " + df.format(sum) + ".");
		System.out.println("\nA m�dia dos n�mero adicionados: " + df.format(sum/(total)) + ".");
		System.out.println("\nO total de n�mero adicionados: " + (total) + ".");
	}
}
