import java.util.*;
public class If
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible to vote!");
		}
		else
		{
			System.out.println("You aren't eligible to vote!");
		}
		sc.close();
	}
}