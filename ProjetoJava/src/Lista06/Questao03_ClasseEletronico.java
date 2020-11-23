package Lista06;

public class Questao03_ClasseEletronico 
{
	/* attributes */
	public String type;
	public String model;
	public int voltage;
	public String company;
	public char efficiency;
	public int consumePerMonth;
	/* constructor */
	public Questao03_ClasseEletronico(String type, String model, int voltage, String company, char efficiency, 
			int consumePerMonth) {
		super();
		this.type = type;
		this.model = model;
		this.voltage = voltage;
		this.company = company;
		this.efficiency = efficiency;
		this.consumePerMonth = consumePerMonth;
	}
	/* methods */
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public char getConsume() {
		return efficiency;
	}
	public void setConsume(char efficiency) {
		this.efficiency = efficiency;
	}
	public String getAllConsume() {
		String AllConsume = null;
		if (efficiency == 'A')
			AllConsume = "O produto é do tipo " + efficiency + ", indicando alta eficiencia.";
		if (efficiency == 'B')
				AllConsume = "O produto é do tipo " + efficiency + ", indicando media eficiencia.";
		if (efficiency == 'C')
			AllConsume = "O produto é do tipo " + efficiency + ", indicando baixa eficiente.";
		return AllConsume;
	}
	public int getConsumePerMonth() {
		return consumePerMonth;
	}
	public void setConsumePerMonth(int consumePerMonth) {
		this.consumePerMonth = consumePerMonth;
	}
}
