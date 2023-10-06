package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Aluno {
// Atributos nome(Conjunto de caracteres,  String) e idade(inteiro)
	private String nome;
	private int idade;
	
/* Construtor, que torna obrigatorio as informacoes para referenciar esse objeto */
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
//Metodos
	// metodo para exibir informacoes do aluno para o usuario
	public String toString() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		return "";	
	}
}