package Lista07;

public class Questao02_main 
{
	public static void main(String[] args) 
	{
		/* instance */
		Questao01_SubClasseCachorro dog01 = new Questao01_SubClasseCachorro("Marley", 8, "Au Au", true);
		Questao01_SubClasseCavalo horse01 = new Questao01_SubClasseCavalo("Veloz", 10, "Hinn In In", true);
		Questao01_SubClassePreguica sloth01 = new Questao01_SubClassePreguica("Coragem", 5, "Aaaaa (agudo)", false);
		/* output */
		Questao01_ClasseAnimal[] animals = new Questao01_ClasseAnimal[3];
		animals[0] = dog01;
		animals[1] = horse01;
		animals[2] = sloth01;
		for (Questao01_ClasseAnimal animal:animals) {
			System.out.println(animal.getSound());
		}
	}
}
