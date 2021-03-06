package br.com.luigipietro.bytebank.modelo;

import java.io.Serializable;

/*
 * Implementando a interface Comparable, a classe fica compar�vel, tendo um comparador "natural"
 */
public abstract class Conta implements Comparable<Conta>, Serializable{

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
        	throw new SaldoInsuficienteException(" Saldo de " + this.getSaldo() + " n�o � suficiente "
        			+ "para sacar " + valor + "!");
        }
            
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

	@Override
	public String toString() {
		
		return this.getTitular().getNome() +  " ag�ncia:" + this.getAgencia() + ",  conta:" + this.getNumero() + ", com saldo de:" + this.getSaldo();
	}

	@Override
	public boolean equals (Object o) {
		Conta c = (Conta) o;
				
		if (this.getAgencia() == c.getAgencia() && 
			this.getNumero() == c.getNumero()) return true;
		else return false;
	}
	
	@Override
	public int compareTo(Conta contaComparada) {
		// Implementa tornando natural a compara��o dos saldos
		return Double.compare(this.saldo, contaComparada.saldo);
	}

}