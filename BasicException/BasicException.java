package BasicException;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicException {
		public static void main(String[] args){
			// Declaracao de variaveis do tipo inteiro
			int tamanho, posicao;
			/* Declaracao de variaveis do tipo booleano, que 
			 * pode assumir apenas 2 valores, verdadeiro ou falso*/
			boolean cont = true, conta = true;
			// Declaracao de scanner, para que o codigo leia o que o usuario digitar
			Scanner lerdados = new Scanner(System.in);
			
			// Do/while, uma clausula de repeticao
			do {
				
				/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
				 * que nao sao totalmente atendidos e geram algum erro */
				try {
					// Pequeno texto sobre a funcao do software
					System.out.println("Para criar uma lista e acessar suas posicoes...");
					System.out.println("Quantos numeros deseja armazenar?");
					//Variavel auxiliar para o tamanho da lista
					tamanho = lerdados.nextInt();
					// Criacao da lista
					int lista[] = new int[tamanho];
					for (int i=0; i<lista.length; i++) {
						// Pedido para informar os valores da lista, digitados pelo usuario
						System.out.printf("Digite os nunmeros [%d]: ",i);
						// Le os valores e os coloca em suas respectivas posicoes na lista
						lista[i]=lerdados.nextInt();
					}
					System.out.println();
					
					// Do/while, uma clausula de repeticao
					do {
						// Pergunta ao usuario a posicao que deseja rever
						System.out.println("Deseja rever qual posição da lista, lembre-se que 0 é uma posição: ");
						posicao = lerdados.nextInt();
						// Exibe o valor da posicao escolhida
						System.out.println(lista[posicao]);
					} while (cont = true);
					
				// Tratamento de excecoes
				/* InputMismatchException indica que um elemento solicitado nao existe, 
				* ou seja, o usuario digitou algo que nao deveria */
				}catch(InputMismatchException e) {
					System.out.println("Digite apenas valores válidos, por favor!");
					
				/* ArrayIndexOutOfBoundsException indica que o usuario tentou acessar
				 * uma posicao da lista que nao existe */
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Essa posição não existe, digite uma posição válida!");
					
				/* NegativeArraySizeException indica que o usuario tentou criar uma lista
				 * com posicoes negativas */
				}catch(NegativeArraySizeException e) {
					System.out.println("Digite um valor válido, por favor!");
				}
			}while(conta = true);
	}
}