class Bicycle
{
	void displayFeatures()
	{
		System.out.println("Features: Pedals, Manual Power");
	}
}

class Motorbike extends Bicycle
{
	void displayFeatures()
	{
		super.displayFeatures();
		System.out.println("Added feature by Motorbike: Engine");
	}
}

class ElectricBike extends Motorbike
{
	void displayFeatures()
	{	
		super.displayFeatures();
		System.out.println("New Feature by Electric Bike: Electric motor and battery.");
	}
}

class MultiHierarchy
{
	public static void main(String [] args)
	{
		ElectricBike myEbike=new ElectricBike();
		myEbike.displayFeatures();
	}
}