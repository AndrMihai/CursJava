package curs9;

public interface Account {
	
	public void deposit(double amount)throws InvalidAmountException;
	public void withdraw(double amount)throws InsuficientFundsException;
	public void checkBalance();

}
