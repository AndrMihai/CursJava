package curs12;

public class TestTextFileProcessor {

	public static void main(String[] args) {
		TextFileProcessor txtFile = new TextFileProcessor();
		txtFile.writeTxt("Textul scris in fisier din java\n");
		txtFile.writeTxt("Textul scris in fisier din java\n");
		txtFile.readTxt();
		txtFile.updateTxtFile("Al;t text in fisier");
		txtFile.readTxt();

	}

}
