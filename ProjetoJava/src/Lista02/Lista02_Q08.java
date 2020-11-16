package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista02_Q08
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0");
		/* variable */
		double num;
		/* input */
		System.out.println("\nEntre com o número: ");
		num = read.nextDouble();
		/* output */
		if (num < 100) 
		{
			System.out.println("\n0.");
		} else {
			System.out.println("\n" + df.format(num) + ".");
		}
	}
}
