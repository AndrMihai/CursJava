package curs11;

public class TestPropertiesFileProcessor {

	public static void main(String[] args) {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("email");
		obj.readPropertiesFile("user");
	}

}
