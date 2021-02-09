/*
   Uma interface não pode conter nada concreto. Todos os métodos são abstratos
 */

public abstract interface Autenticavel{

	public abstract void setSenha(int senha); 
	
	public abstract boolean autentica(int senha);
	
}
