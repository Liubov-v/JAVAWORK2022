package animals;

import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

public class Giraffe extends Animal {
	
	private double neckLength;
	
	public Giraffe(String name)
	{
		super(name, new Point(50, 0), 450, new Herbivore());
		this.neckLength = 1.5;
		MessageUtility.logConstractor("Giraffe", "Giraffe");
	}

	public Giraffe(String name, Point location) {
		super(name, location, 450, new Herbivore());
		this.neckLength = 1.5;
		MessageUtility.logConstractor("Giraffe", "Giraffe");
	}

	public Giraffe(String name, Point location, double weight) {
		super(name, location, weight, new Herbivore());
		this.neckLength = 1.5;
		MessageUtility.logConstractor("Giraffe", "Giraffe");
	}
	
	public Giraffe(String name, Point location, double weight, double neckLength)
	{
		super(name, location, weight, new Herbivore());
		if(neckLength >= 1 && neckLength <= 2.5)
			this.neckLength = neckLength;
		else
			this.neckLength = 1.5;
		MessageUtility.logConstractor("Giraffe", "Giraffe");
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
