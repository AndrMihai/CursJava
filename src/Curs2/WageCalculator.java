package Curs2;

public class WageCalculator {
	
	public int workedHours = 40;

	public static void main(String[] args) {
		
	/*	System.out.println("Print de test");
		WageCalculator obj = new WageCalculator();
        obj.printGreetings(); */
		
		Tester tester1 = new Tester(); //1st constructor
		tester1.setNume("Oana");
		tester1.ratePerHour = 25;
		
		Tester tester2 = new Tester(); //1st constructor -> fara parameters, trebuie declarati separat
		tester2.setNume("Maria");
		tester2.ratePerHour = 30;
		
		Tester tester3 = new Tester("Ion", 15); //2nd constructor -> parameters used that were declared in the 2nd constructor
		
		Developer dev1 = new Developer();
		dev1.setNume("Cristi");
		dev1.ratePerHour = 35;
		
		System.out.println("Rate per hour for " + tester1.getNume() +  " is " + tester1.ratePerHour);
		System.out.println("Rate per hour for " + tester2.getNume() +  " is " + tester2.ratePerHour);
		System.out.println("Rate per hour for " + tester3.getNume() +  " is " + tester3.ratePerHour);
		WageCalculator obj = new WageCalculator();
		//obj.calculateSalary(tester1.ratePerHour);
		
		System.out.println("Salariul lui " + tester1.getNume() + " este " + obj.calculateSalary(tester1.ratePerHour));
		System.out.println("Salariul lui " + tester3.getNume() + " este " + obj.calculateSalary(tester3.ratePerHour));
		System.out.println("Salariul lui " + dev1.getNume() + " este " + obj.calculateSalary(dev1.ratePerHour));
		System.out.println("Salariul lui " + dev1.getNume() + " este " + obj.calculateSalary(40));
	}
	
	public int calculateSalary(int plataPeOra) {
		return workedHours * plataPeOra;
	}
	
	public void printGreetings() {
		System.out.println("Buna dimineata"); //sysout- Eclipse sout-Intellij
	}

}
