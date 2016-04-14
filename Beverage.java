package design;

public abstract class Beverage {
	String description = "unbekannt";
	
	public String getDescription(){
		return description;
	}
	public abstract double cost();
	
}
