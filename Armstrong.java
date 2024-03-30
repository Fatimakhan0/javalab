import java.util.*;
public class Armstrong 
{
	public static void main(String[] ar)
	{
		int sum=0,n,orn;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		orn=n;
		while(orn!=0)
		{
			int rem=orn%10;
			sum+=rem*rem*rem;
			orn/=10;
		}
		if (sum==n)
		{
			System.out.println("Armstrong Number!");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		sc.close();
	}
}