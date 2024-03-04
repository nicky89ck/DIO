package desafioControleDeFluxo;

import java.util.Scanner;

public class ContadorJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = input.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = input.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage());
		}
		input.close();
	}

	private static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException  {
		// validar se parametro um é maior do que parametro dois
		
		if(parametroUm> parametroDois) {
			throw new ParametrosInvalidosException("O segundo número deve ser maior do que o primeiro.");
		}
		
		int contagem = parametroDois - parametroUm;
		
		// Realizar o for para imprimir os números com base na variável contagem
		for(int i = 1; i<=contagem; i++) {
			 System.out.println("Imprimindo o número " + i);
		}
		
	}
	
}


