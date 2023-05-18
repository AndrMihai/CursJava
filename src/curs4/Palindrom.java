package curs4;

public class Palindrom {

	public static void main(String[] args) {
		
		checkPalindrom("masina");

	}
	public static void checkPalindrom(String cuvant) {
		/*
		 * cuvantIntors = "";
		 * cuvant = radar
		 * 
		 * cuvantIntors = cuvantIntors + "r";
		 * cuvantIntors = cuvantIntors + "a";
		 * 
		 * 
		 */
		
		String cuvantIntors = "";
		for(int i = cuvant.length()-1; i>=0; i--) {
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
		}
		
		String result = cuvantIntors.equals(cuvant) ? "Este palindrom" : "Nu este palindrom";
		System.out.println(result);
		
	}

}
