package BasicException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicException {
		public static void main(String[] args){
			int tamanho, posicao;
			boolean cont = true, conta = true;
			Scanner lerdados = new Scanner(System.in);
			
			do {
				try {
					System.out.println("Para criar uma lista e acessar suas posicoes...");
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
