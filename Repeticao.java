package CalculadoraDinamica;

import java.util.Scanner;

public class Repeticao {
	
	public boolean repetir = false;
	public int comando;
	Operacoes operacoes = new Operacoes();
	Historico historico = new Historico();
	
	public void condicaoDaRepeticao(Scanner scanner) {
		
	/*/
		  Contexto principal referente a repetição do código executado na classe Menu com base na escolha do 
		  usuário na variável 'comando' que muda o estado da variável 'repetir', que por consequencia executa 
		  a ação feita na função 'defineSeRepete' = repetindo ou terminando o programa.
	/*/
		
		
		if(repetir) {
			
			do {
				
				System.out.println();
				operacoes.defineQuantidadeEValores(scanner);
				
				//Fazendo a última verificação de quantidade para continuar o programa
				if(operacoes.getQuantidade() >= operacoes.getQuantidadeMinima()) {
					
					operacoes.defineTipoDeCalculo(scanner);
					
				}else {
					
					System.exit(0);
					
				}

				System.out.println("\nDeseja visualizar o histórico?"); 
				String simounao = scanner.nextLine();
				
				if(simounao.equalsIgnoreCase("sim")) {
					
					historico.exibirHistorico(operacoes);
					
				}else if(simounao.equalsIgnoreCase("não")) {
			
					//Visualização de histórico negada
					
				}else {
					
					System.out.println("Opção inválida ou inexistente.");
					
				}
				
				defineSeRepete(scanner);
				
			}while(comando == 1);
			
		}else if(!repetir) {
			
			//condição falsa = programa terminado
			
		}
		
	}
	
	public void defineSeRepete(Scanner scanner) {
	
		try {
		
			System.out.println("\n(1) - Reiniciar\n(2) - Terminar\nDigite:");
			comando = Integer.parseInt(scanner.nextLine());
		
		}catch(NumberFormatException e) {
			
			System.out.println("Tipo de número/caracter inválido.");
			System.exit(1);
			
		}
		
		if(comando == 1) {
			
			repetir = true;
			
		}else if(comando == 2) {
			
			repetir = false;
			System.out.println("Programa terminado.");
			scanner.close();
			System.exit(0);
			
		}
		
	}
	
}
