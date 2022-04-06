package mobility;

public class Point {
	private double x;
	private double y;
	private static final int xMax = 800;
	private static final int yMax = 600;
	private static final int min = 0;
	
	public Point(int x, int y)
	{
		if(Point.checkBoundaries(new Point(x, y, 1)))
		{
			this.x = x;
			this.y = y;
		}
	}
	
	public Point(int x, int y, int check)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX() {return this.x;}
	public double getY() {return this.y;}
	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}
	public int getMaxX() {return xMax;}
	public int getMaxY() {return yMax;}
	public int getMin() {return min;}
	public static boolean checkBoundaries(Point b)
	{
		if((b.getX() >= b.getMin()) && (b.getX() <= b.getMaxX()) && (b.getY() >= b.getMin()) && (b.getY() <= b.getMaxY()))
			return true;
		return false;
	}
}
