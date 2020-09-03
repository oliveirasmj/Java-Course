package aula126_SobreposicaoPalavraSuper.entities;

public class BusinessAccount extends Account{
	
	private Double loanLimit;

	public BusinessAccount() {
		super(); //herda campos do construtor de account
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //herda campos do construtor de account
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) { //emprestimo
		if (amount <= loanLimit) {
			balance += amount - 10.0; //descontar taxa de 10
		}
	}
	
	@Override
	public void withdraw(double amount) { //chamar m�todo da superclasse e escrever o c�digo � nossa maneira
		super.withdraw(amount); //Escrever c�digo igual � super classe
		balance -= 2.0; //Mas aplicar uma taxa
	}
}
