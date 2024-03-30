import java.util.*;
public class NestedIf
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your favorite iconic character:");
		String act=sc.nextLine();
		if(act.equals("Iron Man"))
		{
			System.out.println("Great choice");
			System.out.println("Enter " +act+"'s real name:");
			String reall=sc.nextLine();
			if (reall.equalsIgnoreCase("Tony Stark"))
			{
				System.out.println("Cool Actor!");
			}
		}
		else
		{
			System.out.println("Character:"+act);
		}
	sc.close();
	}
}