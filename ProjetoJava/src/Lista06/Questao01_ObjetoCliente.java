package Lista06;

public class Questao01_ObjetoCliente 
{
	public static void main (String args[])
	{
		/* instance */
		Questao01_ClasseCliente client01 = new Questao01_ClasseCliente("James", "Black", 986340000, 123456789, "JB@gmail.com", true);
		Questao01_ClasseCliente client02 = new Questao01_ClasseCliente("Katherine", "West", 986340101, 987654321, "KW@gmail.com", false);
		Questao01_ClasseCliente client03 = new Questao01_ClasseCliente("Camilla", "Holmes", 986342020, 123123123, "CH@gmail.com", true);
		/* output */
		System.out.println("\nLista de clientes:\n");
		System.out.println(client01.getAllName() + "\t" + client01.getCellphone() + "\t" + client01.getEmail() + "\t" + client01.getCpf() + "\t" + client01.isAdvertisements());
		System.out.println(client02.getAllName() + "\t" + client02.getCellphone() + "\t" + client02.getEmail() + "\t" + client02.getCpf() + "\t" + client02.isAdvertisements());
		System.out.println(client03.getAllName() + "\t" + client03.getCellphone() + "\t" + client03.getEmail() + "\t" + client03.getCpf() + "\t" + client03.isAdvertisements());
	}
}
