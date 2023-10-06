package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.Scanner;
import java.util.InputMismatchException;
import Entidades.Conta;

public class Main {

	public static void main(String[] args) {
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		
		// Declaracao de variavel do tipo string
		String nome, codIdent;
		// Declaracao de variaveis do tipo float, decimais
		float saldo, deposito = 0, saque = 0;
		// Declaracao de variaveis do tipo inteiro
		int escolha;
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
		try {
			// Pequeno texto sobre a funcao do software
			System.out.println("Para simular um sistema de conta...");
			System.out.println("Digite seu nome: ");
			nome = lerdados.next();
			System.out.println("Qual sera seu saldo inicial?");
			saldo = lerdados.nextFloat();
			System.out.println("Defina uma senha: ");
			codIdent = lerdados.next();
			Conta conta = new Conta(codIdent, saldo);
			
			// Do/while, uma clausula de repeticao
			do {
				// Breve menu de opcoes para o usuario
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Depositar");
				System.out.println("2 - Sacar");
				escolha = lerdados.nextInt();
				
				/* Switch/case é uma estrutura de condição que define o código a ser 
				 * executado com base em uma comparação de valores*/
				switch(escolha) {
				case 1:
					System.out.println("Quanto deseja depositar?");
					deposito = lerdados.nextFloat();
					conta.calcDeposito(deposito);
					break;
				case 2:
					System.out.println("Quanto deseja sacar?");
					saque = lerdados.nextFloat();
					conta.calcSaque(saque);
					break;
				default:
					System.out.println("Um teste ou uma brincadeira?");
				}
			}while(escolha == 1 || escolha == 2);
			
		// Tratamento de excecoes
		/* InputMismatchException indica que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores válidos, por favor!");
		}
	}
}