package Lista02;

import java.util.Scanner;

public class Lista02_Q06 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		int age;
		/* input */
		System.out.println("\nEntre com a idade do nadador: ");
		age = read.nextInt();
		/* output */
		if (age < 0)
		{
			System.out.println("\nValor inválido.");
		} else if (age > 0 && age < 5) {
			System.out.println("\nNão há categoria para essa idade.");
		} else if (age >= 5 && age <= 7) {
			System.out.println("\nO nadador entra na categoria Infatil A.");
		} else if (age > 7 && age <= 11) {
			System.out.println("\nO nadador entra na categoria Infatil B.");
		} else if (age > 11 && age <= 13) {
			System.out.println("\nO nadador entra na categoria Juvenil A.");
		} else if (age > 13 && age <= 17) {
			System.out.println("\nO nadador entra na categoria Juvenil B.");
		} else {
			System.out.println("\nO nadador entra na categoria Adulto.");
		}
	}
}
