package animals;

import diet.Carnivore;
import diet.Herbivore;

import java.util.Random;
import mobility.Point;
import utilities.MessageUtility;

public class Lion extends Animal {
	
	private int scarCount = 0;
	
	public Lion(String name)
	{
		super(name,new Point(20, 0), 408.2, new Carnivore());
		MessageUtility.logConstractor("Lion", "Lion");
	}
	
	public Lion(String name, Point location)
	{
		super(name, location, 408.2, new Carnivore());
		MessageUtility.logConstractor("Lion", "Lion");
	}
	
	public Lion(String name, Point location, double weight) {
		super(name, location, weight, new Herbivore());
		MessageUtility.logConstractor("Lion", "Lion");
	}

	@Override
	public void makeSound() {
		int r = (new Random()).nextInt(2);
		if(r == 0)
			this.roar();
	}
	
	public void roar()
	{
		MessageUtility.logSound(this.getName(), "Roar!!!!");
		scarCount += 1;
	}
	
}
