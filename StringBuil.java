import java.util.*;
class StringBuil
{
	public static void  main(String[] ar)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		s1.concat("Hey");
		System.out.println("String after concatenation is : "+s1);
		StringBuilder sb=new StringBuilder("Hola ");
		sb.append("Hello ");
		System.out.println("String after appending is : "+sb);
		StringBuffer sb1= new StringBuffer("World");
		sb1.insert(1,"Wide");
		System.out.println("String after inserting is "+sb1);
	}
}