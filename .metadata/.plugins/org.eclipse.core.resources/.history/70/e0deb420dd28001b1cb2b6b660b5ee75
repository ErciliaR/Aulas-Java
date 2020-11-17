package Lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista03_Q06 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		/* variables */
		int a=0, b=0, c=0;
		/* input */
		while (a == b || b==c || a==c)
		{
		System.out.println("\nEntre com três números.");
		System.out.println("\nPrimeiro número:");
		a = read.nextInt();
		System.out.println("\nSegundo número:");
		b = read.nextInt();
		System.out.println("\nTerceiro número:");
		c = read.nextInt();
		}
		int great=a;
		int [] n= {a,b,c};
		/* calculate and output */
		for (int i = 0; i < 3; i++ )
		{
			if (n[i] > great)
			{
				great=n[i];
			}
		}
		System.out.println("\nO maior número inserido é " + df.format(great) + ".");
	}
}
