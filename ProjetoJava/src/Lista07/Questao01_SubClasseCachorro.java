package Lista07;

public class Questao01_SubClasseCachorro extends Questao01_ClasseAnimal
{
	/* attributes */
	private boolean run;
	/* constructor */
	public Questao01_SubClasseCachorro(String name, int age, String sound, boolean run) {
		super(name, age, sound);
		this.run = run;
	}
	/* methods */
	public String isRun() {
		String status;
		if (run == true)
			status = "O cachorro deve correr";
		else
			status = "O cachorro não deve correr";
		return status;
	}
	public void setRun(boolean run) {
		this.run = run;
	}
	@Override
	public String getSound() {
		return "O "+ super.getName() + " tem " + super.getAge() + " anos e faz " + super.getSound() + ".";
	}
}
