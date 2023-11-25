package Principal;
import java.util.Scanner;
import java.util.InputMismatchException;
import Entidades.Conta;

public class Main {

	public static void main(String[] args) {
		Scanner lerdados = new Scanner(System.in);
		
		String nome, codIdent;
		float saldo, deposito = 0, saque = 0;
		int escolha;
		
		try {
			System.out.println("Para simular um sistema de conta...");
			System.out.println("Digite seu nome: ");
			nome = lerdados.next();
			System.out.println("Qual sera seu saldo inicial?");
			saldo = lerdados.nextFloat();
			System.out.println("Defina uma senha: ");
			codIdent = lerdados.next();
			Conta conta = new Conta(codIdent, saldo);
			
			do {
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Depositar");
				System.out.println("2 - Sacar");
				escolha = lerdados.nextInt();
				
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
			
		/* InputMismatchException indica que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores válidos, por favor!");
		}
	}
}
