package diet;

import food.*;
import animals.Animal;

public interface IDiet {
	public final static int num = 100;
	public boolean canEat(EFoodType food);
	public double eat(Animal animal, IEdible food);
	public static double getAddedWeightForMeat(Animal animal)
	{
		return animal.getWeight()*0.1;
	}
	
	public static double getAddedWeightForHerb(Animal animal)
	{
		return animal.getWeight()*0.07;
	}
}
