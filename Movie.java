public class Movie
{
	String title;
	int release_year;
	Movie (String title, int year)
	{
		this.title=title;
		this.release_year=year;
	}
	public void display()
	{
		System.out.println("Title : "+title);
		System.out.println("Year : "+release_year);
	}
}