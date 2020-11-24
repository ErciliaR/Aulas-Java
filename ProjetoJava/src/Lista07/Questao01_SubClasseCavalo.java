package Lista07;

public class Questao01_SubClasseCavalo extends Questao01_ClasseAnimal
{
	/* attributes */
	public boolean run;
	/* constructor */
	public Questao01_SubClasseCavalo(String name, int age, String sound, boolean run) {
		super(name, age, sound);
		this.run = run;
	}
	/* methods */
	public String isRun() {
		String status;
		if (run == true)
			status = "O cavalo deve correr";
		else
			status = "O cavalo não deve correr";
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
