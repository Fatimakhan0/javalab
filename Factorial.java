import java.io.*;
public class Factorial
{
	public static void main(String[] ar)
throws IOException
{
	int f=1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the no:");
	int n=Integer.parseInt(br.readLine());
	for (int i=1;i<=n;i++)
	{
		f=f*i;
	}
	System.out.println("Factorial of "+n+" is "+f);
	}
}