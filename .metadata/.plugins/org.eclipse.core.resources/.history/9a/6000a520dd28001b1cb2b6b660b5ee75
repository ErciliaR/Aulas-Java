package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista02_Q02 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		/* variables */
		final double rate=10.0, rateExcess=20.0;
		int hours;
		double excess, ToPay;
		String OperatiorCode;
		/* input */
		System.out.println("\nEntre com o código do operário: ");
		OperatiorCode = read.nextLine();
		System.out.println("\nEntre com as horas de trabalho: ");
		hours = read.nextInt();
		if (hours < 0)
		{
			System.out.println("\nValor inválido.");
		} else if (hours >= 0 && hours <= 50) {
			ToPay = rate * hours;
			System.out.println("\nValor a ser pago ao operador" + OperatiorCode + " é " + df.format(ToPay) 
								+ " reais sem excedente a ser pago.");
		} else {
			excess = rateExcess * (hours - 50);
			ToPay = rate * 50;
			System.out.println("\nO valor a ser pago ao operador " + OperatiorCode + " é " + " reais e o "
					+ "excedente a ser pago é " + df.format(excess) + ".");
		}
	}
}
