package model;


public class Conta {
	
	private int id_conta;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String nascimento;
	private String senha;
	
	public Conta(String nome, String sobrenome, String cpf, String nascimento,
				 String senha, int id) {
		this.id_conta = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNome:"+this.nome+"\nCPF:"+this.cpf+"\nSenha:"+this.senha+"\n"+
				"Nascimento:"+this.nascimento+"\nId da conta:"+this.id_conta;
	}
	public boolean login(String nome, String senha) {
		// Para se verificar o conteúdo em sí, se usa o .equals
		if (nome.equals(this.nome) && senha.equals(this.senha)) {
			return true;
		}
		return false;
	}
}
