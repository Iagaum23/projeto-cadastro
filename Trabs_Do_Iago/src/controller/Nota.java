package controller;

import util.Teclado;

public class Nota {

public static void main(String[] args) {
		

		
		
		double nota1, situacao, nota2, nota3, nota4;

		nota1 = Teclado.lerDouble("digite a sua 1º nota");
		nota2 = Teclado.lerDouble("digite a sua 2º nota");
		nota3 = Teclado.lerDouble("digite a sua 3º nota");
		nota4 = Teclado.lerDouble("digite a sua 4º nota");
		
        situacao = (nota1 + nota2 + nota3 + nota4) / 4;
        
		System.out.println("A sua Situação escolar e de: (" + situacao + ")");

		
		if(situacao <= 2) {
		System.out.println("condição = REPROVADO"  );
	} else {
		if(situacao >= 4 && situacao <= 6 ) {
			System.out.println("condição = RECUPERAÇÃO "   );
		} else {
			if(situacao >= 7 && situacao <= 8 ) {
				System.out.println("condição = Aprovado com Merito "   );
			} else {
				if(situacao >= 9 && situacao <= 10 ) {
					System.out.println("condição = Aprovado como um dos melhores "   );
				}
		}
			
	}
	
	

}

	}

	public void versao_iago() {
		double nota[] = new double[5];
		for (int x = 0; x < 4; x++) {
			nota[x] = Teclado.lerDouble("Insira a "+(x+1)+"º nota: ");
			nota[4] += nota[x];
		}
		nota[4] = nota[4] / 4;
		System.out.println("A sua situação atual é: "+nota[4]);
		if(nota[4] >= 9) {
			System.out.println("Aprovado com merito");
		}else if(nota[4] >= 7) {
			System.out.println("Aprovado");
		}else if(nota[4] >=4) {
			System.out.println("Recuperação");	
		}else if(nota[4] <=3) {
			System.out.println("Reprovado");
		}
	}
}