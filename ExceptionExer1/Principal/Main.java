package Principal;
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Aluno;

public class Main {
	public static void main(String[] args){
		Scanner lerdados = new Scanner(System.in);
		
		String nome;
		int idade, quantNotas, posicao;
		float total = 0, media = 0;
		boolean cont = true;
		
		try {
			System.out.println("Para cadastrar alunos e suas notas... ");
			System.out.println("Qual o nome do aluno?");
			
			nome = lerdados.next();
			System.out.println("Qual a sua idade?");
			idade = lerdados.nextInt();
			Aluno aluno = new Aluno(nome, idade);
			
			System.out.println("Quantas notas possui?");
			quantNotas = lerdados.nextInt();
			float notas[] = new float[quantNotas];
			for(int i=0; i<quantNotas; i++) {
				System.out.printf("Informe os números [%d]: ",i);
				notas[i] = lerdados.nextFloat();
			}
			
			for(int i=0; i<notas.length; i++) {
				total = total+notas[i];
				media = total/notas.length;
			}
			System.out.println();
			
			aluno.toString();
			System.out.println("Media: "+media);
			System.out.println();
			
			do {
				System.out.println("Digite a posição da nota que deseja ver, lembre-se que 0 é uma posição: ");
				posicao = lerdados.nextInt();
				System.out.println(notas[posicao]);
			} while (cont = true);
			
		/* InputMismatchException indica que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores válidos, por favor!");
			
		/* ArrayIndexOutOfBoundsException indica que o usuario tentou acessar
		* uma posicao da lista que nao existe */
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Digite apenas posições existentes!");
			
		/* NegativeArraySizeException indica que o usuario tentou criar uma lista
		* com posicoes negativas */
		}catch(NegativeArraySizeException e) {
			System.out.println("Digite um valor válido, por favor!");
		}
	}
}
