package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo = 0;
		
		
		
		System.out.println(">>>Bem vindo ao banco DIO!<<<");
		
		System.out.println("\n\nInforme seu nome e sobrenome:");
		nomeCliente = entrada.nextLine();
		
		System.out.println("Por favor, digite o número da Agência:");
		agencia = entrada.next();
		
		System.out.println("Por favor, digite o número da sua conta(apenas numeros):");
		numero = entrada.nextInt();
		
		System.out.println("\n\nGostaria de realizar um deposito em sua nova conta DIO?");
		System.out.println("Digite - 1 - para sim. Digite - 2 - para não.");
		int resposta = entrada.nextInt();
		
		while(resposta != 1 && resposta != 2) {
			System.out.println("Opção Incorreta. Escolha 1 para sim, 2 para não.");
			resposta = entrada.nextInt();
		}
		
		if(resposta ==1) {
			System.out.print("Digite o valor do deposito: R$");
			saldo = entrada.nextDouble();
			System.out.println("\n\nOlá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, "
					+ "sua agência é "+agencia+", conta "+numero+" e seu saldo R$" + saldo +
					  " já está disponível para saque.");
		}else {
			System.out.println("\n\nOlá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, "
					+ "sua agência é "+agencia+", conta "+numero+" já está disponível para realizar deposito.");
		}
			
		System.out.println("\nO Banco DIO agradece a preferência.");
		entrada.close();

	}

}
