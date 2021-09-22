package model;

public class Conta {

	private String nome;
	private String senha;
	private String sobrenome;
	private int idade;
	
	public Conta(String nome, String sobrenome, String senha, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.senha = senha;
		this.idade = idade;
	}

	
	public boolean logar(String nome, String senha) {
		if (this.nome.equals(nome) && this.senha.equals(senha)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", senha=" + senha + ", sobrenome=" + sobrenome + ", idade=" + idade + "]";
	}
}