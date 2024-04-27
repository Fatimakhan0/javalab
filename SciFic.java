public class SciFic extends Movie
{
	private String mainActor;
	public SciFic(String title,int year,String mainActor)
	{
		super(title,year);
		this.mainActor=mainActor;
	}
	public void disp()
	{
		super.display();
		System.out.println("Main Actor : "+mainActor);
	}
}