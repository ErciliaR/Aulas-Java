package Lista06;

public class Questao01_ClasseCliente 
{
	/* attributes */
	public String name;
	public String surname;
	public long cellphone;
	public long cpf;
	public String email;
	public boolean advertisements;
	/* constructor */
	public Questao01_ClasseCliente(String name, String surname, long cellphone, long cpf, String email,
			boolean advertisements) {
		super();
		this.name = name;
		this.surname = surname;
		this.cellphone = cellphone;
		this.cpf = cpf;
		this.email = email;
		this.advertisements = advertisements;
	}
	/* methods */
	public String getAllName() {
		String AllName = name + " " + surname;
		return AllName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public long getCellphone() {
		return cellphone;
	}
	public void setCellphone(long cellphone) {
		this.cellphone = cellphone;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String isAdvertisements() {
		String responce;
		if (advertisements == true)
			responce = "Accepts advertisements.";
		else
			responce = "Does not accepts advertisements."; 
		return responce;
	}
	public void setAdvertisements(boolean advertisements) {
		this.advertisements = advertisements;
	}
}
