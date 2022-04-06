package animals;

import diet.Omnivore;
import mobility.Point;
import utilities.MessageUtility;

public class Bear extends Animal {
	
	private String furColor;
	
	public Bear(String name)
	{
		super(name, new Point(100, 5), 308.2, new Omnivore());
		this.furColor = "GRAY";
		MessageUtility.logConstractor("Bear", "Bear");
	}

	public Bear(String name, Point location) {
		super(name, location, 308.2, new Omnivore());
		this.furColor = "GRAY";
		MessageUtility.logConstractor("Bear", "Bear");
	}

	public Bear(String name, Point location, double weight) {
		super(name, location, weight, new Omnivore());
		this.furColor = "GRAY";
		MessageUtility.logConstractor("Bear", "Bear");
	}
	
	public Bear(String name, Point location, double weight, String furColor)
	{
		super(name, location, weight, new Omnivore());
		if(furColor.equals("GRAY") || furColor.equals("BLACK") || furColor.equals("WHITE"))
			this.furColor = furColor;
		else
			this.furColor = "GRAY";
		MessageUtility.logConstractor("Bear", "Bear");
	}

	@Override
	public void makeSound() {
		this.roar();

	}
	
	public void roar()
	{
		MessageUtility.logSound(this.getName(), "ROAR!!!!");
	}

}
