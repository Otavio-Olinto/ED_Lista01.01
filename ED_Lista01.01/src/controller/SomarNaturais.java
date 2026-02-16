package controller;

public class SomarNaturais {

	public SomarNaturais() {
		super();
	}
	
	public int SomaRecursiva(int limite) {
		
		// A soma dos número naturais será uma regressão do numero desejado até 0
		// Portanto zero é o ponto de parada
		
		if(limite==0) {
			return 0;
		}
		
		// Caso o número atual não seja zero, a função se chama novamente
		// Com seu valor decrescido em 1, somada ao número atual.
		
		return limite+(SomaRecursiva(limite-1));
	}

}
