package Lista06;

public class DesafioPOO_main 
{
	public static void main(String[] args) 
	{
		/* instance */
		DesafioPOO_Questao02_SubClasseFornecedor suplier01 = new DesafioPOO_Questao02_SubClasseFornecedor ("José Silva", "Rua Brasil 57", "+55 19 12345-5678", 5800, 3785);
		/* output */
		System.out.println("\nFornecedores:\n");
		System.out.println(suplier01.getName() + "\t" + suplier01.getAddress() + "\t" + suplier01.getPhone() + "\tSaldo: " + suplier01.isBalance() + " reais");
	}
}
