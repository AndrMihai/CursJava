package curs12;

public class TestJsonFileProcessor {

	public static void main(String[] args) {
		JsonFileProcessor obj = new JsonFileProcessor();
		obj.writeJsonFile();
		obj.readJson("name");
		obj.readJson("email");
		obj.readJson("listaObiecte");
		System.out.println("---------------------------------------------------------------");
		
		obj.updateJsonFile("email", "electronicmail");
		System.out.println("Email after update");
		obj.readJson("email");
		obj.deleteFromJson("email");
		System.out.println("email after delete");
		obj.readJson("email");

	}

}
