package desafioControleDeFluxo;

import java.util.Scanner;

public class ContadorJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = input.nextInt();
		int parametroDois;
		
		//iniciando o looping para o usuário que informou o segundo parametro menor poder inserir novo dado correto
		do {
			System.out.println("Digite o segundo parâmetro:");
			parametroDois = input.nextInt();
			
			try {
				//chamando o método cotendo a lógica de contagem
				contar(parametroUm, parametroDois);
			}catch(ParametrosInvalidosException e) {
				//Imprimir a mensagem:O segundo parâmetro deve ser maior que o primeiro
				System.out.println(e.getMessage());
			}
		}while(parametroDois <= parametroUm);
		
		input.close();
	}
	
	//metodo para realizar a contagem
	private static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException{
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior do que o primeiro.");
		}
		
		//logica da contagem
		int contagem  = parametroDois - parametroUm;
		//Realizar o for pra impimir os numeros com base na variável contagem
		for (int i = 1; i<= contagem; i++) {
			System.out.println("imprimindo o número " + i);
		}
	}
	
}