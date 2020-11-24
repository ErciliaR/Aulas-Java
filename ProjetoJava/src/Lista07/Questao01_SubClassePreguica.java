package Lista07;

public class Questao01_SubClassePreguica extends Questao01_ClasseAnimal
{
	/* attributes */
	public boolean goUp;
	/* constructor */
	public Questao01_SubClassePreguica(String name, int age, String sound, boolean goUp) {
		super(name, age, sound);
		this.goUp = goUp;
	}
	/* methods */
	public String isGoUp() {
		String status;
		if (goUp == true)
			status = "A pregu�a deve subir em �rvore";
		else
			status = "A pregu�a n�o deve subir em �rvore";
		return status;
	}
	public void setGoUp(boolean goUp) {
		this.goUp = goUp;
	}
	@Override
	public String getSound() {
		return "O "+ super.getName() + " tem " + super.getAge() + " anos e faz " + super.getSound() + ".";
	}
}
