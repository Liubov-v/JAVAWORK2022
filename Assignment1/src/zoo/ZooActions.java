package zoo;

import animals.Animal;
import animals.Bear;
import animals.Elephant;
import animals.Giraffe;
import animals.Lion;
import animals.Turtle;
import food.IEdible;
import mobility.Point;

public class ZooActions {

	public static boolean eat(Object animal, IEdible food)
	{
		if(animal instanceof Animal)
		{
			Animal a = (Animal)animal;
			return a.eat(food);
		}
		return false;		
	}
	public static boolean move(Object animal, Point point)
	{
		if(animal instanceof Animal)
		{
			Animal a = (Animal)animal;
			if(Point.checkBoundaries(point) == false)
				return false;
			return a.setWeightAfterMoving(point);
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}
