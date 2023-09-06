package CalculadoraDinamica;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Operacoes operacoes = new Operacoes();
		operacoes.defineQuantidadeEValores(scanner);
		
		//Fazendo a última verificação de quantidade para continuar o programa
		if(operacoes.getQuantidade() >= operacoes.getQuantidadeMinima()) {
			
			operacoes.defineTipoDeCalculo(scanner);
		
		}
		
		//Chamando a impressão do histórico 
		
		System.out.println("\nDeseja visualizar o histórico?");
		String simounao = scanner.nextLine();
		
		if(simounao.equalsIgnoreCase("sim")) {
			
			Historico historico = new Historico();
			historico.exibirHistorico(operacoes);
			
		}else if(simounao.equalsIgnoreCase("não")) {
	
			System.exit(0);
			
		}	
			
		//Chamando o loop de repetição
		Repeticao repeticao = new Repeticao();
		repeticao.defineSeRepete(scanner);
		repeticao.condicaoDaRepeticao(scanner);
		
		//...
	
		scanner.close();
		System.exit(0);
		
	}

}
