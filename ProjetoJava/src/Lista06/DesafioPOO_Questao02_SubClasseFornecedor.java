package Lista06;

public class DesafioPOO_Questao02_SubClasseFornecedor extends DesafioPOO_Questao01_ClassePessoa 
{
	/* attributes */
	public float creditValue;
	public float debtValue;
	/* constructor */
	public DesafioPOO_Questao02_SubClasseFornecedor(String name, String address, String phone, float creditValue,
			float debtValue) {
		super(name, address, phone);
		this.creditValue = creditValue;
		this.debtValue = debtValue;
	}
	/* methods */
	public float isBalance() {
		float balance = creditValue - debtValue;
		return balance;
	}
	public float getCreditValue() {
		return creditValue;
	}
	public void setCreditValue(float creditValue) {
		this.creditValue = creditValue;
	}
	public float getDebtValue() {
		return debtValue;
	}
	public void setDebtValue(float debtValue) {
		this.debtValue = debtValue;
	}
}
