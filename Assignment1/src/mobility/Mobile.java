package mobility;

import java.math.*;

public class Mobile implements ILocatable{
	private Point location;
	private double totalDistance;
	
	public Mobile(Point location)
	{
		this.location = location;
		this.totalDistance = 0.0;
	}
	
	private void addTotalDistance(double distance)
	{
		this.totalDistance += distance;
	}
	
	private double calcDistance(Point destination)
	{
		if(Point.checkBoundaries(destination) == true)
		{
			double result = 
					(destination.getX() - location.getX())*(destination.getX()- location.getX()) 
					+ 
					(destination.getY() - location.getY())*(destination.getY() - location.getY());
			result = Math.sqrt(result);
			return result;
		}
		return 0.0;
	}
	
	public double move(Point destination)
	{
		double result = this.calcDistance(destination);
		this.addTotalDistance(result);
		this.setLocation(destination);
		return result;
	}
	
	public Point getLocation() {
		return this.location;
	}
	
	public boolean setLocation(Point point) {
		location.setX(point.getX());
		location.setY(point.getY());
		return true;
	}
	
}
