package br.com.luigipietro.bytebank.modelo;

/***
 * Classe conta Corrente, herdade de Conta
 * @author Luiz Alberto Alano
 *
 */
public class ContaCorrente extends Conta implements Tributavel{

	/***
	 * 
	 * @param agencia	Número da Agência
	 * @param numero	Número da conta corrente
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	/***
	 * @param	valor	Valor a sacar. Será adicionado 0,20 de taxas
	 * @throws	SaldoInsuficienteException	Em caso de saldo insuficiente
	 */
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor+ 0.2;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		
		return "Conta corrente " + super.toString();
	}
	
}
