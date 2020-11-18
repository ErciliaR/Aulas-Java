package Lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista04_Q09 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		/* variables */
		float num, anwser;
		/* input */
		System.out.println("\nEntre com o número: ");
		num = read.nextFloat();
		anwser = num;
		if (num <= 0)
			System.out.println("\nValor inválido.");
		else{
		/* calculate and output */
			System.out.println("\n" + df.format(anwser));
			while (anwser >0 && anwser < 100) 
			{
				anwser = anwser*3; 
				System.out.println("\n" + df.format(anwser));
			}
		}
	}
}
