package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Aluno {
	private String nome;
	private int idade;
	
/* Construtores */
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
//Metodos
	public String toString() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		return "";	
	}
}
