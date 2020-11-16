package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista02_Q05 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		/* variables */
		double index;
		/* input */
		System.out.println("\nEntre com o indice de poluição medido: ");
		index = read.nextDouble();
		/* calculate and output */
		if (index < 0)
		{
			System.out.println("\nValor inválido.");
		} else if (index >= 0.0 && index <= 0.25) {
			System.out.println("\nValor do indice está dentro do aceitável.");
		} else if (index >= 0.3) {
			System.out.println("\nO valor do indice " + df.format(index) + " está acima do aceitável as industrias do primeiro "
					+ "grupo deve suspender suas atividades.");
		} else if (index >= 0.4) {
			System.out.println("\nO valor do indice " + df.format(index) + " está acima do aceitável as industrias do primeiro "
					+ " e segundo grupo devem suspender suas atividades.");
		} else if (index >= 0.5) {
			System.out.println("\nO valor do indice " + df.format(index) + " está acima do aceitável todos os grupos devem "
					+ "suspender suas atividades.");
		} else {
			System.out.println("\nO indice está acima do aceitava, mas nenhuma industria deve ser acionada ainda.");
		}
	}
}
