class IronMan extends SuperHero
{
	String mov;
	IronMan (String name, String power, String bhvr, int age, String movie)
	{
		super(name,power,bhvr,age);
		this.mov=movie;
	}
	void display()
	{
		super.display();
		System.out.println("Movie name :"+mov);
	}
} 