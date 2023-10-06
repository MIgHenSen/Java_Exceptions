package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Aluno;

public class Main {
	public static void main(String[] args){
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		
		// Declaracao de variavel do tipo string
		String nome;
		// Declaracao de variaveis do tipo inteiro
		int idade, quantNotas, posicao;
		// Declaracao de variaveis do tipo float, decimais
		float total = 0, media = 0;
		/* Declaracao de variaveis do tipo booleano, que 
		 * pode assumir apenas 2 valores, verdadeiro ou falso*/
		boolean cont = true;
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
		try {
			System.out.println("Para cadastrar alunos e suas notas... ");
			System.out.println("Qual o nome do aluno?");
			// Variavel que recebe nome do aluno
			nome = lerdados.next();
			System.out.println("Qual a sua idade?");
			// Variavel que recebe idade do aluno
			idade = lerdados.nextInt();
			// Criacao do objeto aluno, baseado em nome e idade
			Aluno aluno = new Aluno(nome, idade);
			
			System.out.println("Quantas notas possui?");
			// Variavel auxiliar para lista de notas
			quantNotas = lerdados.nextInt();
			// Criacao de lista de notas
			float notas[] = new float[quantNotas];
			for(int i=0; i<quantNotas; i++) {
				// Pedido para informar os valores da lista, digitados pelo usuario
				System.out.printf("Informe os números [%d]: ",i);
				// Le os valores e os coloca em suas respectivas posicoes na lista
				notas[i] = lerdados.nextFloat();
			}
			
			// Metodo para calcular media das notas
			for(int i=0; i<notas.length; i++) {
				total = total+notas[i];
				media = total/notas.length;
			}
			System.out.println();
			
			// Exibindo informacoes e medias dos alunos
			aluno.toString();
			System.out.println("Media: "+media);
			System.out.println();
			
			// Do/while, uma clausula de repeticao
			do {
				// Pergunta ao usuario a posicao que deseja rever
				System.out.println("Digite a posição da nota que deseja ver, lembre-se que 0 é uma posição: ");
				posicao = lerdados.nextInt();
				// Exibe o valor da posicao escolhida
				System.out.println(notas[posicao]);
			} while (cont = true);
			
		// Tratamento de excecoes
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