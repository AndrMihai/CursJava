package Homework;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Tema11Ex1 {

	public static void main(String[] args) {		
			
			List<Vegetable> list =  new ArrayList<Vegetable>();
			list.add (new Vegetable("morcov", 38));
			list.add (new Vegetable("rosie", 69));
			list.add (new Vegetable("castravete", 4));
			list.add (new Vegetable("varza", 420));
			
			try(FileWriter fileWriter = new FileWriter("Vegetable.txt")){
				for(int i = 0; i<list.size(); i++) {
					fileWriter.write(list.get(i).getName() + " " + String.valueOf(list.get(i).getkcal()));
					fileWriter.write("\n");
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}

	}

}
