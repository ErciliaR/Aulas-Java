package Projetinho;

public class Cliente 
{
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
    /* methods */
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
    @Override
    public String toString() {
        return "cliente: " + getNome() + ", cpf: " + getCpf() 
        + ", fone: " + getFone() + ", endereco: " + getEndereco() + ".";
    }
}
