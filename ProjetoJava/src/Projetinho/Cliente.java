package Projetinho;

import java.util.Scanner;

public class Cliente 
{
	private Scanner ler;
	/* attributes */
	private String nome;
    private String cpf;
    private String fone;
    private String endereco;
    /* constructor */
    public Cliente(String nome, String cpf, String fone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
        this.endereco = endereco;
    }
    public Cliente() {
    }
    /* method to subscribe */
    public void Cadastro() {
    	ler = new Scanner(System.in);
    	System.out.println("Digite seu nome:");
		this.nome = ler.next();
		System.out.println("Digite seu CPF:");
		this.cpf = ler.next();
		System.out.println("Digite seu telefone:");
		this.fone = ler.next();
		System.out.println("Digite seu endereço:");
		this.endereco = ler.next();
	}
    /* method to confirm subscription */
    public void ConfirmarCadastro() {
    	ler = new Scanner(System.in);
    	System.out.println("CADASTRO:");
    	System.out.println(toString());
    	int i=2;
	    while(i!=1 && i!=0) {
    	System.out.println("Para CONFIRMAR cadastro pressione 1, caso contrario 0: ");
    	i = ler.nextInt();
	    }
	    switch(i) {
		case 0: 
    		System.out.println("\nVocê cancelou a operação... Que pena. Volte sempre!");
    		System.exit(0);
		case 1:
    		System.out.println("\nVocê está quase lá... Proxima etapa é forma de pagamento. Obrigad@ por escolher a nossa loja!!");
    	}
    }
    /* method toString */
    @Override
    public String toString() {
        return "cliente: " + nome + ", cpf: " + cpf 
        + ", fone: " + fone + ", endereco: " + endereco + ".";
    }
    /* methods (getters and setters) */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
