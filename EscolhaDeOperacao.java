package CalculadoraDinamica;

import java.util.Scanner;

public class EscolhaDeOperacao {
   
    Scanner scanner = new Scanner(System.in);

    public void defineTipoDeCalculo(Operacoes operacoes) {
		
   	//Chamando a função referente ao tipo de calculo escolhido pelo usuário dentro da própria classe 'Operacoes'
		
		System.out.println("\nDigite o tipo de calculo que deseja fazer (somar, subtrair, multiplicar, dividir, media de numeros)"); operacoes.escolheoCalculo = scanner.nextLine();
		
		if(operacoes.escolheoCalculo.equalsIgnoreCase("somar")) {
			
			operacoes.realizaCalculoDeSoma();
			
		}else if(operacoes.escolheoCalculo.equalsIgnoreCase("subtrair")) {
			
			operacoes.realizaCalculoDeSubtracao();
			
		}else if(operacoes.escolheoCalculo.equalsIgnoreCase("multiplicar")) {
			
			operacoes.realizaCalculoDeMultiplicacao();
			
		}else if(operacoes.escolheoCalculo.equalsIgnoreCase("dividir")) {
			
			operacoes.realizaCalculoDeDivisao();
			
		}else if(operacoes.escolheoCalculo.equalsIgnoreCase("media de numeros")) {
		
			operacoes.realizaCalculoDeMedia();
			
		}else {
			
			System.out.println("Nome de operação incorreto ou inválido.");
			
		}

    }

}
