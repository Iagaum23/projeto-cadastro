package controller;

import util.Teclado;

public class Trabaalho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String login = "Usuario1", senha = "12345678";
		
		login = Teclado.lerTexto("Insira o seu login:");
		senha = Teclado.lerTexto("Insira sua senha:");
		
		if (login.equals("Usuario1") && senha.equals("12345678")) {
			System.out.println("Usuário logado!");
		} else { 
			System.out.println("Login inválido");
		}

	}

}
