package design;

public class Espresso extends Beverage{
	
	public Espresso() {
		description ="Expresso";
	}
	@Override
	public double cost(){
		return 2;
	}
}