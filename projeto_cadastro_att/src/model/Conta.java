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
	
	public int getId_conta() {
		return id_conta;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public String getSenha() {
		return senha;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNome:"+getNome()+"\nCPF:"+getCpf()+"\nSenha:"+getSenha()+"\n"+
				"Nascimento:"+getNascimento()+"\nId da conta:"+getId_conta();
	}
	public boolean login(String nome, String senha) {
		// Para se verificar o conteúdo em sí, se usa o .equals
		if (nome.equals(getNome()) && senha.equals(getSenha())) {
			return true;
		}
		return false;
	}
}
