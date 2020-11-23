package Lista06;

public class DesafioPOO_Questao01_ClassePessoa 
{
	/* attributes */
	public String name;
	private String address;
	private String phone;
	/* constructor */
	public DesafioPOO_Questao01_ClassePessoa(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public DesafioPOO_Questao01_ClassePessoa () {
	}
	public DesafioPOO_Questao01_ClassePessoa (String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	/* methods */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
