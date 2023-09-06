package CalculadoraDinamica.Codigo;

public class Historico {

	public void exibirHistorico(Operacoes operacoes) {
		
		System.out.println("\nTipo de calculo feito: " + operacoes.escolheoCalculo);
		
		//Realiza a impressão dos números inseridos anteriormente linha por linha
		for(int h = 0; h < operacoes.getQuantidade(); h++) {
			
			System.out.println("\n" + (h + 1) + " número inserido: " + operacoes.numeros[h]);
			
		}
		
	}
	
}
