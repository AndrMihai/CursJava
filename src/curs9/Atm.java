package curs9;
import java.util.*;


/*
 * Simulam lucrul cu un ATM
 * avem 3 operatiuni: 
 * 1. Withdraw
 * 2. Deposit
 * 3. checkBalance
 * 
 * Intrebam userul ce operatiune vrea sa faca.
 * Daca vrea withdraw (balance = balance - amount) si printam soldul
 * -> daca withdraw este mai mare decat balanta atunc InsuficientFunds
 * daca vrea deposit (balance = balance + amount) si printam soldul
 * -> daca amount <=0 throw InvalidAmountException
 * daca vrea checkBalance (printam soldul)
 * 
 * programul face parte dintr-un intreg sistem bancar, ceea ce implica multiple conturi (cont curent, economii etc)
 * toate conturile au aceleasi 3 operatiuni, dar implementari specifice.
 * noi implementam ATM pe cont curent
 * 
 * Dupa ce utilizatorul efectueaza o operatiune, il intrebam daca vrea sa continue
 */

public class Atm {
	double amount;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		CurrentAccount acc = new CurrentAccount();
		acc.balance = 1000;
		
		//acc.checkBalance();
		Atm atm = new Atm();
		boolean flag = true;
		while(flag) {
			//Scanner scan = new Scanner(System.in);
			try {
				atm.atmOperations(acc);
				System.out.println("Doresti sa continui ?");
				flag = scan.nextBoolean();
			} catch (InvalidAmountException e) {
				
				e.printStackTrace();
			} catch (InsuficientFundsException e) {
				
				e.printStackTrace();
			}
		}
		scan.close();
		
	}
	
	public void atmOperations(CurrentAccount obj) throws InvalidAmountException, InsuficientFundsException {
		//Scanner scan = new Scanner(System.in);
		System.out.println("Hi, Available operations are:");
		System.out.println("1 Deposit");
		System.out.println("2 Withdraw");
		System.out.println("3 Check Balance");
		
		int option = scan.nextInt();
		switch (option) {
		
		case 1:
			System.out.println("Please enter the deposit amount: ");
			double amount = scan.nextDouble();
			obj.deposit(amount);
			break;
		case 2:
			System.out.println("Please enter the withdraw amount: ");
			double amount2 = scan.nextDouble();
			obj.withdraw(amount2);
			break;
		case 3:
			obj.checkBalance();
			break;
		default: 
			System.out.println("Invalid Option!");
		}
		//scan.close();
		//scan.reset();
		
	}

}
