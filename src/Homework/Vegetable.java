package Homework;

public class Vegetable {
	
	private String name;
	private int kcal;
	
	public Vegetable(String name, int kcal){
		this.name = name;
		this.kcal = kcal;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getkcal(){
		return this.kcal;
	}

}
