import java.util.Scanner;
class StringOp2
{
	public static void main(String[] ar)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String nam=sc.nextLine();
		if(nam.equals("Java"))
		{
			System.out.println("Good choice!");
		}
		else
		{
			System.out.println("You have entered "+nam);
		}
	sc.close();
	}
}