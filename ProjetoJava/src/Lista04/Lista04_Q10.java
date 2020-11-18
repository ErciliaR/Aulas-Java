package Lista04;

import java.util.Scanner;

public class Lista04_Q10 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		int num=233;
		/* calculate and output */
		do
		{
			System.out.println("\n"+ num +".");
			num = num + 5;
		} while (num < 300);
		do
		{
			System.out.println("\n"+ num +".");
			num = num + 3;
		} while (num < 400);
		do
		{
			System.out.println("\n"+ num +".");
			num = num + 5;
		} while (num <= 456);
	}
}

