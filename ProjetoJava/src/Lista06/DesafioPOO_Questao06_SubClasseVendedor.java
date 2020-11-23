package Lista06;

public class DesafioPOO_Questao06_SubClasseVendedor extends DesafioPOO_Questao01_ClassePessoa
{
	/* attributes */
	public float salesValue;
	public float wageBase;
	/* constructor */
	public DesafioPOO_Questao06_SubClasseVendedor(String name, String address, String phone, float salesValue,
			float wageBase) {
		super(name, address, phone);
		this.salesValue = salesValue;
		this.wageBase = wageBase;
	}
	/* methods */
	public float getSalesValue() {
		return salesValue;
	}
	public void setSalesValue(float salesValue) {
		this.salesValue = salesValue;
	}
	public float getWageBase() {
		return wageBase;
	}
	public void setWageBase(float wageBase) {
		this.wageBase = wageBase;
	}
	public float isComission() {
		float comission = (salesValue/wageBase);
		return comission;
	}
}
