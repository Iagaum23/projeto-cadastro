package controller;

import java.util.ArrayList;
import java.util.List;
import model.Conta;
import util.Teclado;

public class BomDIa {

	public static void main(String[] args) {
		Conta users = null;
		List<Conta> usuarios = new ArrayList<Conta>();
		do {
			int opc = Teclado.lerInt("Você deseja:\n1)Logar\n2)Criar\n3)Sair\nR:");
			if (opc == 1) {
				String nome_laranja = Teclado.lerTexto("Insira seu nome:");
				String senha_laranja = Teclado.lerTexto("Insira seu senha:");
				for (int x = 0; x < usuarios.size() ;x++) {
					users = usuarios.get(x);
					if (users.logar(nome_laranja, senha_laranja)) {
						System.out.println("Logado!");
						System.out.println(users);
						System.out.println();
						break;
					}
				}
			} else if(opc == 2) {
				String nome_laranja = Teclado.lerTexto("Insira seu nome:");
				String senha_laranja = Teclado.lerTexto("Insira seu senha:");
				String sobrenome_laranja = Teclado.lerTexto("Insira seu sobrenome:");
				try {
					System.out.println("Informe sua idade");
					int idade_laranja = Teclado.lerInt("Informe sua idade");
					usuarios.add(new Conta(nome_laranja, sobrenome_laranja, senha_laranja, idade_laranja));
				} catch (Exception e) {
					System.out.println("Erro!\nTente novamene!");
				}} else {
				System.exit(0);
			}
			System.out.println(usuarios);
		}while(true != false);

	}

}
