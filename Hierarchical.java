class SuperHero
{
	String name;
	String power;
	public SuperHero(String name, String power)
	{
		this.name=name;
		this.power=power;
	}
	public void usePower()
	{
		System.out.println(name+" uses "+power);
	}
}

class IronMan extends SuperHero
{
	public IronMan(String name)
	{
		super(name," advanced technology.");
	}
}

class SpiderMan extends SuperHero
{
	public SpiderMan(String name)
	{
		super(name," web-slinging and spider-like abilities. ");
	}
}

public class Hierarchical
{
	public static void main(String[] args)
	{
		IronMan im=new IronMan("Iron Man");
		SpiderMan sm=new SpiderMan("Spiderman");
		im.usePower();
		sm.usePower();
	}
}