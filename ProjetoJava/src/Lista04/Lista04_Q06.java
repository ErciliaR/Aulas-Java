package Lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista04_Q06 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		/* variables */
		int kids, sumKids=0, under=0;
		double wage, higherWage=0, sumWage=0;
		/* input and calculate */
		for (int i = 1; i < 21 ; i++)
		{
			wage=-1;
			kids=-1;
			while (wage < 0 || kids < 0)
			{
			System.out.println("\nRespostas do habitante " + i + ".");
			System.out.println("\nQual o seu salário? ");
			wage = read.nextDouble();
			System.out.println("\nQuantos filhos você tem? ");
			kids = read.nextInt();
			}
			sumWage += wage;
			sumKids += kids;
			if (wage > higherWage)
				higherWage = wage;
			if (wage <= 100)
				under++;
		}
		/* output */
		System.out.println("\nA média de salários da população: " + df.format(sumWage/20) + " reais.");
		System.out.println("\nA média de número de filhos dessa população: " + (sumKids/20) + ".");
		System.out.println("\nO maior salários da população: " + df.format(higherWage) + ".");
		System.out.println("\nO percentual de pessoas com salários até 100 reais: " + df.format(100.0*under/20.0) + " %.");
	}
}
