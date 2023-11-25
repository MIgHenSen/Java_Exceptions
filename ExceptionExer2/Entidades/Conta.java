package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Conta {
	private float saldo;
	private float limite = saldo;
	private String codIdent;
	
/* Construtores */
	public Conta(String codIdent, float saldo) {
		this.saldo = saldo;
		this.codIdent = codIdent;
		limite = limite;
	}
	
//Metodos
	public void calcDeposito(float deposito) {
		saldo = saldo+deposito;
		System.out.println("Seu saldo: "+saldo);
	}
	
	public void calcSaque(float saque){
		saldo = saldo-saque;
		if (saldo < 0) {
			saldo = saldo+saque;
		}
		System.out.println("Saldo: "+saldo);
	}
	
//Gets e Sets
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
}
