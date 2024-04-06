import java.util.*;
class StringBuff
{
	public static void  main(String[] ar)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		s1.concat("Hey");
		System.out.println("String after concatenation is : "+s1);
		StringBuffer sb=new StringBuffer("Hola ");
		sb.append("Hello ");
		System.out.println("String after appending is : "+sb);
		sb.reverse();
		System.out.println("Reversed string is : "+sb);
		StringBuffer sb2=new StringBuffer("Oak Pre");
		sb2.replace(6,9,"Java");
		System.out.println(sb2);
	}
}