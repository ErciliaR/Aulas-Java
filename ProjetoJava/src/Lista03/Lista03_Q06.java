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
		System.out.println("\nEntre com tr�s n�meros.");
		System.out.println("\nPrimeiro n�mero:");
		a = read.nextInt();
		System.out.println("\nSegundo n�mero:");
		b = read.nextInt();
		System.out.println("\nTerceiro n�mero:");
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
		System.out.println("\nO maior n�mero inserido � " + df.format(great) + ".");
	}
}
