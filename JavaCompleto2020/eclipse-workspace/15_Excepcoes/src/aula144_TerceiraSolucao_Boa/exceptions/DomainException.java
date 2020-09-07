package aula144_TerceiraSolucao_Boa.exceptions;

public class DomainException extends Exception { // Exception - tem de tratar excep��o com try catch ou throws ||| RuntimeException - n�o tem de ser tratada
	
	private static final long serialVersionUID = 1L; // isto � gerado automatico porque Exception � serialazable e necessita da versao
	public DomainException(String msg) {
		super(msg); // passar para o construtor da superclasse
	}
}
