class SuperHero
{
	String sname,spower,behavior;
	int ag;
	SuperHero(String name, String power, String bhvr,int age)
	{
		this.sname=name;
		this.spower=power;
		this.behavior=bhvr;
		this.ag=age;
	}
	void display()
	{
		System.out.println("Your Hero is");
		System.out.println("Name : "+sname);
		System.out.println("Super power : "+spower);
		System.out.println("Behaviour : "+behavior);
		System.out.println("Age : "+ag);
	}
}