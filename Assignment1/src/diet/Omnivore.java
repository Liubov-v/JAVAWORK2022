package diet;

import animals.Animal;
import animals.Lion;
import food.EFoodType;
import food.IEdible;
import mobility.Point;

public class Omnivore implements IDiet {
	

	@Override
	public boolean canEat(EFoodType food) {
		if(food.equals(EFoodType.MEAT) || food.equals(EFoodType.VEGETABLE)) 
		{
			return true;
		}
			return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		if(this.canEat(food.getFoodType()))
		{
			if(food.getFoodType().equals(EFoodType.MEAT))
				return IDiet.getAddedWeightForMeat(animal);
			return IDiet.getAddedWeightForHerb(animal);
		}
		return 0;
	}
}
