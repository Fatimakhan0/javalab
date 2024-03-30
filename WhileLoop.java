import java.util.*;
public class WhileLoop
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter the limit of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the marks:");
		int marks[]=new int[n];
		while(i<n)
		{
			marks[i]=sc.nextInt();
			i++;
		}
		System.out.println("The marks are:");
		for (int nn:marks)
		{
			System.out.println(nn);
		}
	sc.close();
	}
}