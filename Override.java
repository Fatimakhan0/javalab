class Shape
{
	public int x,y;
	void printArea()
	{
		System.out.println("Prints the area of the shape.");
	}
}

class Rectangle extends Shape
{
	void printArea()
	{
		System.out.println("Area of rectangle is " +x*y);
	}
}

public class Override
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.x=10;
		r.y=20;
		r.printArea();
	}
}