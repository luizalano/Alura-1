/*
   Uma interface n�o pode conter nada concreto. Todos os m�todos s�o abstratos
 */

public abstract interface Autenticavel{

	public abstract void setSenha(int senha); 
	
	public abstract boolean autentica(int senha);
	
}
