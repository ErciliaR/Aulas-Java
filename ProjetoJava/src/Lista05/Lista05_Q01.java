package Lista05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista05_Q01 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variable */
		int [] side= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		DecimalFormat df = new DecimalFormat("#0.0");
		int sum=0, greater=0, times=0;
		/* input and calculate */
		for (int i = 0; i < 10; i++)
		{
			while (side[i] < 0)
			{
			System.out.println("\nEntre com o valor do lan�amento " + (i+1) + ": ");
			side[i] = read.nextInt();
			if (side[i] < 0 || side[i] > 6)
				System.out.println("\nValor inv�lido. Digite novamente...");
			}
			sum+=side[i];
			if (side[i] > greater)
				greater = side[i];
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println("\nO valor do lan�amento " + (i+1) + " adicionado foi: " + side[i] + ".");
			if (side[i] == greater)
				times++;
		}
		/* output */
		System.out.println("\nA media entre os valores �: "+ df.format(sum/10.0) + ".");
		System.out.println("\nO maior valor obtido � " + greater + " e o n�mero de vezes que ele apareceu foi " + times + ".");
	}
}
