package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import mobility.Point;

public class Herbivore implements IDiet{

	@Override
	public boolean canEat(EFoodType food) {
		if(food.equals(EFoodType.VEGETABLE))
			return true;
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		if(this.canEat(food.getFoodType()))
		{
			return IDiet.getAddedWeightForHerb(animal);
		}
		return 0;
	}

}
