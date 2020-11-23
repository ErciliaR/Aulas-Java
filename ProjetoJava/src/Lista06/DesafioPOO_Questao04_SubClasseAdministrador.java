package Lista06;

public class DesafioPOO_Questao04_SubClasseAdministrador extends DesafioPOO_Questao01_ClassePessoa
{
	/* attributes */
	public float refound;
	/* constructor */
	public DesafioPOO_Questao04_SubClasseAdministrador(String name, String address, String phone, float refound) {
		super(name, address, phone);
		this.refound = refound;
	}
	/* methods */
	public float getRefound() {
		return refound;
	}
	public void setRefound(float refound) {
		this.refound = refound;
	}
}
