package animals;

import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

public class Turtle extends Animal {
	
	private int age;
	
	public Turtle(String name)
	{
		super(name, new Point(80, 0), 1, new Herbivore());
		MessageUtility.logConstractor("Turtle", "Turtle");
	}

	public Turtle(String name, Point location) {
		super(name, location, 1, new Herbivore());
		this.age = 1;
		MessageUtility.logConstractor("Turtle", "Turtle");
	}

	public Turtle(String name, Point location, double weight) {
		super(name, location, weight, new Herbivore());
		this.age = 1;
		MessageUtility.logConstractor("Turtle", "Turtle");
	}

	public Turtle(String name, Point location, double weight, int age)
	{
		super(name, location, weight, new Herbivore());
		if(age >= 0 && age <= 500)
			this.age = age;
		else
			this.age = 1;
		MessageUtility.logConstractor("Turtle", "Turtle");
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
