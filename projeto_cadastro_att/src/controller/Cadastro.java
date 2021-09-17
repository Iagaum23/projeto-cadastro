package controller;


import model.Conta;
import util.IntegridadeCPF;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Cadastro {
	public static void main(String[] args) {
		int opp;
		String cpf;
		Conta users = null;
		int contador = 0;
		List<Conta> usuarios = new ArrayList<Conta>();
		while (true) {
			Object[] opc = {"Criar conta", "Logar", "Sair"};
			opp = JOptionPane.showOptionDialog(null, "Seja bem vindo ao Banco\n"+
			"Deseja Criar sua conta ou logar-se?", "Cadastro", 
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
			null, opc, opc[0]);
			if ((String)opc[opp] == "Criar conta") {
				String nome = JOptionPane.showInputDialog(null, 
						"Insira seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				String sobrenome = JOptionPane.showInputDialog(null, 
						"Insira seu sobrenome.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				String senha = JOptionPane.showInputDialog(null,
						"Insira sua senha.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				do {
				cpf = JOptionPane.showInputDialog(null, 
						"Insira seu CPF (Sem máscara)", null, JOptionPane.INFORMATION_MESSAGE);
						if (!IntegridadeCPF.CPF(cpf)) {
							JOptionPane.showMessageDialog(null, "O CPF:"+cpf+"\nÉ inválido.", "Cadastro", JOptionPane.ERROR_MESSAGE);
						}
				} while(!IntegridadeCPF.CPF(cpf));
				String nascimento = JOptionPane.showInputDialog(null, 
						"Insira sua data de nascimento", null, JOptionPane.INFORMATION_MESSAGE);
				usuarios.add(new Conta(nome, sobrenome, cpf, nascimento, senha, contador));
				contador += 1;
				JOptionPane.showMessageDialog(null, "Parábens, Cadastro feito", "Cadastro", JOptionPane.PLAIN_MESSAGE);
			}
			else if(opc[opp] == "Logar") {
				String nome_laranja = JOptionPane.showInputDialog(null, "Insira seu nome.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				String senha_laranja = JOptionPane.showInputDialog(null, "Insira sua senha.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				for(int x = 0; x<usuarios.size(); x++) {
					users = usuarios.get(x);
					System.out.println(users);
					System.out.println(usuarios);
					if(users.login(nome_laranja, senha_laranja)) {
						System.out.println("Login efetuado");
						break;
						}}
				
			}
			else {
				JOptionPane.showMessageDialog(null,"O programa está sendo"+
			" finalizado!", null, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}

	}}

}
