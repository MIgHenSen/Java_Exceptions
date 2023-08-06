package Exer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExer1 {

	public static void main(String[] args) throws InputMismatchException, ArrayIndexOutOfBoundsException, NegativeArraySizeException{
		int tamanho, posicao;
		boolean cont = true, conta = true;
		Scanner lerdados = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Quantos numeros deseja armazenar?");
				tamanho = lerdados.nextInt();
				int lista[] = new int[tamanho];
				for (int i=0; i<lista.length; i++) {
					System.out.printf("Digite os nunmeros [%d]: ",i);
					lista[i]=lerdados.nextInt();
				}
				System.out.println();
				
				do {
					System.out.println("Deseja rever qual posição da lista, lembre-se que 0 é uma posição: ");
					posicao = lerdados.nextInt();
					System.out.println(lista[posicao]);
				} while (cont = true);
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas valores válidos, por favor!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Essa posição não existe, digite uma posição válida!");
			}catch(NegativeArraySizeException e) {
				System.out.println("Digite um valor válido, por favor!");
			}
		}while(conta = true);
	}
}