package Lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista03_Q05 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		/* variables */
		int faces = 0;
		double side;
		/* input */
		while (faces < 3 || faces > 5)
		{
			System.out.println("\nEntre com o número de lados do polígono: ");
			faces = read.nextInt();
			if (faces < 3) 
			{
				System.out.println("\nNão é um polígono.");
			} else if (faces > 5) {
				System.out.println("\nO polígono não identificado.");
			}
		}
		System.out.println("\nEntre com o lado do polígono em cm: ");
		side = read.nextDouble();
		/* calculate and output */
		switch (faces)
		{
			case 3:
				System.out.println("\nTRIÂNGULO\n" + "A área do triângulo equilátero " + df.format(Math.sqrt(3)*Math.pow(side, 2)/4) + " cm2.");
				break;
			case 4:
				System.out.println("\nQUADRADO\n" + "A área do quadrado " + df.format(Math.pow(side, 2)) + " cm2.");
				break;
			case 5:
				System.out.println("\nPENTAGONO\n" + "A área do pentagono " + df.format(Math.sqrt(3)*Math.pow(side, 2)*3/2) + " cm2.");
				break;
		}
	}
}
