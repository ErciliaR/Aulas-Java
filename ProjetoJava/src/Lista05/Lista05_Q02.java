package Lista05;

import java.util.Scanner;

public class Lista05_Q02 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variable */
		float [][] n1=new float[4][6], n2=new float[4][6], m1=new float[4][6], m2=new float[4][6];
		/* input and calculate */
		for (int line = 0; line < 4; line++)
			for(int column = 0; column < 6; column++)
			{
				System.out.println("Insira o elemento N1[" + (line+1) +"][" + (column+1) + "] :");
				n1[line][column] = read.nextFloat();
			}
		for (int line = 0; line < 4; line++)
			for(int column = 0; column < 6; column++)
			{
				System.out.println("Insira o elemento N2[" + (line+1) +"][" + (column+1) + "] :");
				n2[line][column] = read.nextFloat();
				m1[line][column] = n1[line][column] + n2[line][column];
				m2[line][column] = n1[line][column] - n2[line][column];
			}
		/* output */
		System.out.println("\nA matriz M1 é:");
		for (int line = 0; line < 4; line++)
		{
			for(int column = 0; column < 6; column++)
				System.out.print("\t[" + m1[line][column] +"]\t");
			System.out.println();
		}
		System.out.println("\nA matriz M2 é:");
		for (int line = 0; line < 4; line++)
		{
			for(int column = 0; column < 6; column++)
				System.out.print("\t[" + m2[line][column] +"]\t");
			System.out.println(); 
		}
	}
}
