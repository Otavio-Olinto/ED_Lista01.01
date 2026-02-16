package view;

import controller.SomarNaturais;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciando a classe SomarNaturais
		
		SomarNaturais metodo = new SomarNaturais();

		// Criando o método de leitura com Scanner
		
		Scanner ler = new Scanner(System.in);
		
		int número, soma;
		
		// Variável "número" para saber o limite da soma 
		System.out.print("Até qual número deseja realizar a soma dos números naturias: ");
		número = Integer.parseInt(ler.nextLine());
		
		soma = metodo.SomaRecursiva(número);
		
		System.out.println("A soma dos número naturais até "+número+" é: "+soma);
		
		ler.close();
		
		System.exit(0);
	}

}
