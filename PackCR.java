package AIDSIIB;
import java.util.Scanner;
class PackCR
{
	public static void main(String[] args)
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the name of CR : ");
        	String Cr1=sc.next();
		PackCR c11=new PackCR();
		c11.display(Cr1);
	}
	public void display (String Crs)
	{
        	if(Crs.equalsIgnoreCase("siri"))
		{
        		System.out.println("Roll number of "+Crs+" is 88.");
        	}
		else
		{
         		System.out.println("CR is "+Crs);
        	}
    	}
}