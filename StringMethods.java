class StringMethods
{
	public static void  main(String[] ar)
	{
		StringBuffer sb=new StringBuffer("Hola ");
		sb.reverse();
		System.out.println("Reversed string is : "+sb);
		StringBuffer sb1= new StringBuffer("World");
		sb1.insert(1,"Wide");
		System.out.println("String after inserting is "+sb1);
		StringBuffer sb2=new StringBuffer("Oak Pre");
		sb2.replace(4,9,"Java");
		System.out.println(sb2);
	}
}