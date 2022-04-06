package animals;

import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

public class Elephant extends Animal {
	
	private double trunkLength;
	
	public Elephant(String name)
	{
		super(name, new Point(50, 90), 500, new Herbivore());
		this.trunkLength = 1;
		MessageUtility.logConstractor("Elephant", "Elephant");
	}

	public Elephant(String name, Point location) {
		super(name, location, 500, new Herbivore());
		this.trunkLength = 1;
		MessageUtility.logConstractor("Elephant", "Elephant");
	}

	public Elephant(String name, Point location, double weight) {
		super(name, location, weight, new Herbivore());
		this.trunkLength = 1;
		MessageUtility.logConstractor("Elephant", "Elephant");
	}
	
	public Elephant(String name, Point location, double weight, double trunkLength)
	{
		super(name, location, weight, new Herbivore());
		if(trunkLength >= 0.5 && trunkLength <= 3)
			this.trunkLength = trunkLength;
		else
			this.trunkLength = 1;
		MessageUtility.logConstractor("Elephant", "Elephant");
	}

	@Override
	public void makeSound() {
		this.chew();
	}
	
	public void chew()
	{
		MessageUtility.logSound(this.getName(), "Chew, chew");
	}

}
