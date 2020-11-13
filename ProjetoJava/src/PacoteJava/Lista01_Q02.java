package PacoteJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Q02 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		/* variable */
		double cost_process, cost_consumer;
		/* input */
		System.out.println("\nEntre com o valor do custo de fabrica (reais): ");
		cost_process = read.nextDouble();
		/* calculate */
		cost_consumer = cost_process / 0.27;
		/* output */
		System.out.println("\nO custo ao consumidor é: " + df.format(cost_consumer) + " reais.");
	}
}
