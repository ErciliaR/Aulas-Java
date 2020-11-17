package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista02_Q01 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		/* variables */
		final double tax=4.0;
		double weight, excess, ToPay;
		/* input */
		System.out.println("\nEntre com o peso de tomate: ");
		weight = read.nextDouble();
		/* calculate and output */
		if (weight < 0)
		{
			System.out.println("\nValor inválido.");
		} else if (weight >= 0 && weight <= 50) {
			System.out.println("\nValor de entrada não precisa ser taxado.");
		} else {
			excess = weight - 50.0;
			ToPay = tax * Math.round(excess);
			System.out.println("\nO valor a ser pago pelo excesso é: " + df.format(ToPay) + " reais.");
		}
	}
}
