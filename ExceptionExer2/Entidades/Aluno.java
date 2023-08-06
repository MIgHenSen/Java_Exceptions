package Entidades;

public class Aluno {
	private String nome;
	private int idade;
	
//Construtores
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
//Metodos - Gets/Sets
	public String toString() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		return "";
		
	}
}