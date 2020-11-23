package Lista06;

public class DesafioPOO_Questao03_SubClasseEmpregado extends DesafioPOO_Questao01_ClassePessoa
{
	/* attributes */
	public int sectorCode;
	public float wageBase;
	public float taxe;
	/* constructor */
	public DesafioPOO_Questao03_SubClasseEmpregado(String name, String address, String phone, int sectorCode,
			int wageBase, float taxe) {
		super(name, address, phone);
		this.sectorCode = sectorCode;
		this.wageBase = wageBase;
		this.taxe = taxe;
	}
	/* methods */
	public int getSectorCode() {
		return sectorCode;
	}
	public void setSectorCode(int sectorCode) {
		this.sectorCode = sectorCode;
	}
	public float getWageBase() {
		return wageBase;
	}
	public void setWageBase(float wageBase) {
		this.wageBase = wageBase;
	}
	public float getTaxe() {
		return taxe;
	}
	public void setTaxe(float taxe) {
		this.taxe = taxe;
	}
	public float isWage() {
		float wage = wageBase + taxe * wageBase;
		return wage;
	}
	
}
