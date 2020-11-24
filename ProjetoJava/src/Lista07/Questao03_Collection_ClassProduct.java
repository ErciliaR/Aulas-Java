package Lista07;

public class Questao03_Collection_ClassProduct 
{
	/* attributes */
	public String name;
	public int quantity;
	/* constructor */
	public Questao03_Collection_ClassProduct(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	public Questao03_Collection_ClassProduct() {
		
	}
	/* methods */
	@Override
	public String toString() {
		return this.name + "\t" + this.quantity + "\t";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
