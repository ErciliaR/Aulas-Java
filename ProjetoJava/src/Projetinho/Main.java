package Projetinho;

public class Main 
{
	public static void main(String[] args)
	{
		/* show storage and ask for client list */
		System.out.println("\nBem vindo a nossa loja!\n");
		Pedido pedido = new Pedido();
		pedido.AdicionarItem();
		/* ask for confirmation */
		switch (pedido.Confirmar()) {
		case 0:
			System.out.println("\nA lista de compras foi cancelada.");
			System.exit(0);
		case 1:
			System.out.println("\nA lista de compras foi confirmada.");
		}
		/* enter with client data */
		Cliente cliente = new Cliente();
		cliente.Cadastro();
		/* ask for confirmation and response */
		switch(cliente.ConfirmarCadastro()) {
		case 1:
    		System.out.println("\nVocê está quase lá... Proxima etapa é forma de pagamento. Obrigad@ por escolher a nossa loja!!");
    	case 0: 
    		System.out.println("\nVocê cancelou a operação... Que pena. Volte sempre!");
    		System.exit(0);
		}
	}
}
