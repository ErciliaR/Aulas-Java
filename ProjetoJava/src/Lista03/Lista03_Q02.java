package Lista03;

import java.util.Scanner;

public class Lista03_Q02 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		/* variables */
		String [] username={"MARCELO", "CAMILLA", "ERCILIA"};
		int [] password={1234, 4321, 0000};
		String user;
		int num_password;
		boolean login=false;
		/* input */
		System.out.println("\nEntre com o primeiro nome do usu�rio (MAIUSCULAS): ");
		user = read.next();
		System.out.println("\nEntre com a senha de quatro digito (9999): ");
		num_password = read.nextInt();
		/* calculate and output */
		for(int i = 0; i < username.length; i++)
			if (user.equals(username[i]) && password[i]== num_password)
				login = true;
 		if (login == true)
			System.out.println("\nAcesso aprovado");
		else
			System.out.println("\nAcesso negado.");
	}
}
