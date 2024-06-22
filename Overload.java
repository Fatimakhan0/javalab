public class Overload
{
	public void calculate()
	{
		System.out.println("Nothing to calculate!");
	}
	public void calculate(int x)
	{
		System.out.println("Circle area :" +Math.PI*Math.pow(x,2));
	}
	public void calculate(double x)
	{
		System.out.println("Circle perimeter:"+2*Math.PI*x);
	}
	public void calculate(int x, int y)
	{
		System.out.println("Rectangle area:"+x*y);
	}
	public static void main(String[] args)
	{
		Overload o1=new Overload();
		o1.calculate();
		o1.calculate(10,20);
		o1.calculate(10.5);
		o1.calculate(10);
	}
}