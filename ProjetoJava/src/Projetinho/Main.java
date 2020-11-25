package Projetinho;

public class Main 
{
	public static void main(String[] args)
	{
		/* show storage and ask for client list */
		System.out.println("\nBEM VINDO A NOSSA LOJA!");
		Pedido pedido = new Pedido();
		pedido.AdicionarItem();
		/* ask for confirmation */
		pedido.Confirmar();
		/* ask for client data */
		Cliente cliente = new Cliente();
		cliente.Cadastro();
		/* ask for confirmation and give response */
		cliente.ConfirmarCadastro();
	}
}
