package Lista04;

import java.util.Scanner;

public class Lista04_Q03
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		int age=0, under=0, over=0;
		/* input and calculate */
		while(age != -99)
		{
			System.out.println("\nEntre com a idade: ");
			age = read.nextInt();
			if (age <= 0 && age != -99)
				System.out.println("\nValor inválido.");
			else if (age > 0 && age < 21)
				under++;
			else if (age > 50)
				over++;
		}
		/* output */
		System.out.println("\nO total de pessoas com idade menor que 21: " + under + ".");
		System.out.println("\nO total de pessoas com idade maior que 50: " + over + ".");
	}
}
