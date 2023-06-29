package curs14.package1;

public class ProtectedAccessModifier {
	
	/*
	 * Protected
	 * Scopul lui este in acelasi pachet si sub-clase din pachete diferite
	 * Clasele nu pot fi declarate ca protected
	 * Aceasi clasa: yes
	 * Alta clasa in acelasi pachet: yes
	 * Sub-clasa in acelasi pachet: yes
	 * 
	 * Sub-clasa in alt pachet: yes
	 * Alata clasa in alt pachet: no
	 * 
	 * 
	 */
	
	protected String mesaj = "Protected Access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}

	public static void main(String[] args) {
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();

	}

}
