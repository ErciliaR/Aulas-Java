package Projetinho;

public class Main 
{
	public static void main(String[] args)
	{
		/* show storage and ask for client list */
		Pedido pedido = new Pedido();
		pedido.AdicionarItem();
		/* ask for confirmation */
		pedido.Confirmar();
		/* enter with client data */
		Cliente cliente = new Cliente();
		cliente.Cadastro();
		/* ask for confirmation */
		if (cliente.ConfirmarCadastro() == true)
			/* note */
			System.out.println("Voc� est� quase l�... Proxima etapa � forma de pagamento. Obrigad@ por escolher a nossa loja!!");
		else
			/* note */
			System.out.println("Voc� cancelou a opera��o... Que pena. Volte sempre!");
	}
}
