package Lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista03_Q03 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		/* variables */
		final double less=0.3, more=0.25; 
		int num;
		/* input */
		System.out.println("\nEntre com o número de maças compradas: ");
		num = read.nextInt();
		/* calculate and input */
		if (num <= 0)
		{
			System.out.println("\nValor inválido.");
		} else if(num > 0 && num < 12) {
			System.out.println("\nO valor total da compra é " + df.format(num*less) + " reais.");
		} else {
			System.out.println("\nO valor total da compra é " + df.format(num*more) + " reais.");
		}
	}
}
