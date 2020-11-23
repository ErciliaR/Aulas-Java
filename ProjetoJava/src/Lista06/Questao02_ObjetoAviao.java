package Lista06;

public class Questao02_ObjetoAviao 
{
	public static void main(String[] args) 
	{
		/* instance */
		Questao02_ClasseAviao aviao01 = new Questao02_ClasseAviao ("ABC321", "Boeing", 230, "LATAM", "Maria Souza", "São Paulo", "Natal", true);
		Questao02_ClasseAviao aviao02 = new Questao02_ClasseAviao ("ASD789", "Airbus", 240, "GOL", "José Silva", "Recife", "Curitiba", false);
		/* output */
		System.out.println("\nLista de voos:\n");
		System.out.println(aviao01.getCode() + "\t" + aviao01.getAllRoute() + "\t" + aviao01.isStopover() + "\t" + aviao01.getCompany() + "\t" + aviao01.getModel() 
		+ "\t" + aviao01.getCapacity() + "\t" + aviao01.getPilote());
		System.out.println(aviao02.getCode() + "\t" + aviao02.getAllRoute() + "\t" + aviao02.isStopover() + "\t" + aviao02.getCompany() + "\t" + aviao02.getModel() 
		+ "\t" + aviao02.getCapacity() + "\t" + aviao02.getPilote());
	}
}
