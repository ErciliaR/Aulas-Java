package Lista06;

public class DesafioPOO_Questao05_SubClasseOperario extends DesafioPOO_Questao01_ClassePessoa
{
	/* attributes */
	public float productionValue;
	public float wageBase;
	
	/* constructor */
	public DesafioPOO_Questao05_SubClasseOperario(String name, String address, String phone, float productionValue,
			float wageBase) {
		super(name, address, phone);
		this.productionValue = productionValue;
		this.wageBase = wageBase;
	}
	/* methods */
	public float getProductionValue() {
		return productionValue;
	}
	public void setProductionValue(float productionValue) {
		this.productionValue = productionValue;
	}
	public float getWageBase() {
		return wageBase;
	}
	public void setWageBase(float wageBase) {
		this.wageBase = wageBase;
	}
	public float isCommision() {
		float comission = (productionValue/wageBase);
		return comission;
	}
}