package animals;

import food.EFoodType;
import food.IEdible;
import diet.IDiet;
import diet.Omnivore;
import mobility.*;
import utilities.MessageUtility;

public abstract class Animal extends Mobile implements IEdible {
	private String name;
	private double weight;
	private IDiet diet;
	
	public Animal(String name, Point location, IDiet diet) 
	{
		super(location);
		this.name = name;
		this.weight = 0;
		this.diet = diet;
		MessageUtility.logConstractor("Animal", "Animal");
	};
	public Animal(String name, Point location, double weight, IDiet diet)
	{
		super(location);
		this.name = name;
		this.weight = weight;
		this.diet = diet;
		MessageUtility.logConstractor("Animal", "Animal");
	}
	public abstract void makeSound();
	public double getWeight() 
	{
		MessageUtility.logGetter(this.name, "getWeight", this.weight);
		return this.weight;
	}
	public String getName()
	{
		MessageUtility.logGetter(this.name, "getName", this.name);
		return this.name;
	}
	public boolean setWeight(double weight)
	{
		MessageUtility.logSetter(this.name, "setWeight", diet, false);
		this.weight = weight;
		return true;
	}
	public boolean eat(IEdible food)
	{
		double num = diet.eat(this, food);
		if(num != 0)
		{
			weight += num;
			return true;
		}
		return false;
		
	}
	public EFoodType getFoodType()
	{
		if(this instanceof Lion)
			return EFoodType.NOTFOOD;
		return EFoodType.MEAT;
	}
	public boolean setWeightAfterMoving(Point destination)
	{
		double finDistance = move(destination);
		this.setWeight(this.weight - (finDistance*this.weight*0.00025));
		if(weight < 0)
			this.weight = 100;
		return true;
	}
}
