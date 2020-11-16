package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Q06 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#00");
		/* variables */
		int years, months, days, a;
		/* input */
		System.out.println("\nQuantos dias vividos você tem? ");
		a = read.nextInt();
		/* calculate and output */
		if (a < 0)
		{
			System.out.println("\nValor inválido.");
		} else {
			years = a / 365;
			months = (a % 365) / 30;
			days = (a % 365) % 30;
			System.out.println("\nA duração foi de: " + df.format(years) + " anos, " + df.format(months) 
								+ " meses e " + df.format(days) + " dias.");
		}
	}
}
