package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Q04 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#00");
		/* variables */
		int seconds, minutes, hours, a;
		/* inputs */
		System.out.println("\nQual a duraçao do processo de fabricação em segundos? ");
		a = read.nextInt();
		/* calculate and output */
		if (a < 0)
		{
			System.out.println("\nValor inválido.");
		} else {
			hours = a / 3600;
			minutes = (a % 3600) / 60;
			seconds = (a % 3600) % 60;
			System.out.println("\nA duração foi de: " + df.format(hours) + " horas, " + df.format(minutes) 
								+ " minutos e " + df.format(seconds) + " segundos.");
		}
	}
}
