package curs10;
import java.util.*;

/*
 * Facem un program care imi returneaza un oras pe baza unui cod postal
 * Avem nevoie de o clasa care sa contina inca de la initializare o serie de coduri postale si orasele asociate lor
 * 6 coduri si 6 orase
 * Avem nevoie de o functionalitate care sa ne permita sa cautam pe baza unui cod si sa returneze orasul
 * daca codul nu exista, vreau sa arunc CodPostalException
 * Daca codul exista vreau sa printez orasul
 * daca codul nu exista, vreau sa intreb din nou pana primesc un cod valid
 */

public class CoduriPostale {

	static Map<Integer, String> cp = new HashMap<>();
	
	public CoduriPostale() {
		cp = new HashMap<>();
		cp.put(404, "Cluj");
		cp.put(303, "Pitesti");
		cp.put(202, "Craiova");
		cp.put(894, "Timisoara");
		cp.put(211, "Buzau");
	}

}
