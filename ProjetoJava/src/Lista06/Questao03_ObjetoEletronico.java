package Lista06;

public class Questao03_ObjetoEletronico 
{
	public static void main(String[] args) 
	{
		/* instance */
		Questao03_ClasseEletronico eletronic01 = new Questao03_ClasseEletronico("Tv", "55 pol.", 220, "Samsung", 'A', 30);
		Questao03_ClasseEletronico eletronic02 = new Questao03_ClasseEletronico("Geladeira", "ABS1230", 110, "Consul", 'C', 500);
		Questao03_ClasseEletronico eletronic03 = new Questao03_ClasseEletronico("Monitor", "29 pol.", 220, "LG", 'B', 50);
		/* output */
		System.out.println("\nLista de produtos:\n");
		System.out.println(eletronic01.getType() + "\t        " + eletronic01.getCompany() + "\t" + eletronic01.getModel() +
		"\tVoltagem: " +eletronic01.getVoltage() + " V" + "\tConsumo de: " + eletronic01.getConsumePerMonth()+
		" kWh/mes" + "\t" + eletronic01.getAllConsume());
		System.out.println(eletronic02.getType() + "\t" + eletronic02.getCompany() + "\t" + eletronic02.getModel() +
		"\tVoltagem: " +eletronic02.getVoltage() + " V" + "\tConsumo de: " + eletronic02.getConsumePerMonth()+
		" kWh/mes" + "\t" + eletronic02.getAllConsume());
		System.out.println(eletronic03.getType() + "\t        " + eletronic03.getCompany() + "\t" + eletronic03.getModel() +
		"\tVoltagem: " +eletronic03.getVoltage() + " V" + "\tConsumo de: " + eletronic03.getConsumePerMonth()+
		" kWh/mes" + "\t" + eletronic03.getAllConsume());
	}
}
