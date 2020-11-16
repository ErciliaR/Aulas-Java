package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Q01 
{

	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		/* variable */
		double n1, n2, n3, media;
		/* input */
		System.out.println("\nEntre com a primeira nota: ");
		n1 = read.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = read.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = read.nextDouble();
		/* calculate */
		media = ((n1*2)+(n2*3)+(n3*5))/10.0;
		/* output */
		System.out.println("\nA média ponderada é: " + df.format(media) + ".");
	}
}