package Curs2;

// UpperCamelCase - NumeleClaseiMele
// lowerCamelCase - numeleMethodeiMele


public class Tester {
	//variabile de insstanta
	private String nume;
	public int ratePerHour;
	
	//constructor default
	public Tester() {
		
	}
	
	//constructor cu parameters
	public Tester(String nume, int ratePerHour) {
		setNume(nume);
		this.ratePerHour = ratePerHour;
	
	}
	
	//metode
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	/* Tester tester1= new Tester();
	 * tester1.setNume("Oana"); ->> inlocuieste tester1.nume = "Oana"
	 */
	
	
	
}
