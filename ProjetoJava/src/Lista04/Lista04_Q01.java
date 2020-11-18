package Lista04;

import java.util.Scanner;

public class Lista04_Q01 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* calculate and output */
		for (int i=1000; i<2000; i++)
			if ((i % 11) == 5)
				System.out.println("\n" + i + ".");
	}
}
