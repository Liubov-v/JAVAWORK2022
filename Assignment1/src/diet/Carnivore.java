package diet;

import food.EFoodType;
import food.IEdible;
import mobility.Point;
import animals.Animal;
import animals.Lion;

public class Carnivore implements IDiet{

	@Override
	public boolean canEat(EFoodType food) {
		if(food.equals(EFoodType.MEAT))
			return true;
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		if(this.canEat(food.getFoodType()))
		{
			return IDiet.getAddedWeightForMeat(animal);
		}
		return 0;
	}
	
	
}
