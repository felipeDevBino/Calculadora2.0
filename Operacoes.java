package CalculadoraDinamica;

import java.util.Scanner;

public class Operacoes {

	public String escolheoCalculo;
	private int quantidade;
	protected int numeros[];
	private final int QUANTIDADE_MINIMA = 2;
	
	public int getQuantidade() {
		
		return(quantidade);
		
	}
	
	public int getQuantidadeMinima() {
		
		return(QUANTIDADE_MINIMA);
		
	}
	
	public void defineQuantidadeEValores(Scanner scanner) {
		
		//Criando um try/catch para interceptar o erro referente a caracteres
		
		try {
			
			System.out.println("Digite a quantidade de números para adicionar no programa:");
			quantidade = Integer.parseInt(scanner.nextLine());
			System.out.println();
			
		}catch(NumberFormatException e) {
			
			System.out.println("Tipo de número/caracter inválido, considere utilizar valores numéricos inteiros: (2, 10, 20) .");
			System.exit(1);

		}
		
		//Atribuindo a quantidade para o vetor de números
		numeros = new int[quantidade];
		
		//Criando uma verificação básica para impedir o programa de continuar caso o número seja inferior a 2
		if(quantidade < QUANTIDADE_MINIMA) {
			
			System.out.println("Quantidade inválida, deve-se inserir um valor superior a 1.");
			System.exit(0);
			
		}else {
			
			try {
				
				for(int q = 0; q < quantidade; q++) {
			
					System.out.println("Digite o " + (q + 1) + " número:");
					numeros[q] = Integer.parseInt(scanner.nextLine());
			
				}
			
			}catch(NumberFormatException e) {
				
				System.out.println("Tipo de número/caracter inválido, considere utilizar valor numéricos inteiros: (1, 10, 20).");
				System.exit(1);
				
			}
			
		}
		
	}
	
	public void realizaCalculoDeSoma() {
		
		int resultadoDaSoma = 0;
		
		for(int s = 0; s < quantidade; s++) {
			
			resultadoDaSoma += numeros[s];
			
		}
		
		System.out.println("\nO resultado da soma é: " + resultadoDaSoma);
		
	}
	
	public void realizaCalculoDeSubtracao() {
		
		int resultadoDaSubtracao = numeros[0];
		
		for(int m = 1; m < quantidade; m++) {
			
			resultadoDaSubtracao -= numeros[m];
			
		}
		
		System.out.println("\nO resultado da subtração é: " + resultadoDaSubtracao);
		
	}
	
	public void realizaCalculoDeMultiplicacao() {
		
		int resultadoDaMultiplicacao = numeros[0];
		
		for(int v = 1; v < quantidade; v++) {
			
			resultadoDaMultiplicacao *= numeros[v];
			
		}
		
		System.out.println("\nO resultado da multiplicação é: " + resultadoDaMultiplicacao);
		
	}
	
	public void realizaCalculoDeDivisao() {
		
		int resultadoDaDivisao = numeros[0];
		
		for(int d = 1; d < quantidade; d++) {
			
			/*/
			 Verifica se o número inserido é diferente de 0, sendo diferente, o cálculo é feito
			 normalmente.
			/*/
			
			if(numeros[d] != 0) { 
				
				resultadoDaDivisao /= numeros[d];
				
			}else { //Caso não seja diferente, portanto, sendo igual a 0 a seguinte mensagem é imprimida:
				
				System.out.println("\nDivisão por 0 encontrada.");
				return;
				//Sai do método
				
			}
			
		}
		
		System.out.println("\nO resultado da divisão é: " + resultadoDaDivisao);
		
	}
	
	public void realizaCalculoDeMedia() {
		
		int somaParaMedia = 0;
		
		for(int cm = 0; cm < quantidade; cm++) {
			
			somaParaMedia += numeros[cm];
			
		}
		
		double calculaMedia = (double) somaParaMedia / quantidade;
		System.out.println("\nA média dos valores digitados é: " + calculaMedia);
		
	}

}