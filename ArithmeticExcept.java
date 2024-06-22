class ArithmeticExcept
{
	public static void main(String[] args)
	{
		try
		{
			int num=10/0;
			System.out.println(num);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(Exception e)
		{
			System.out.println("Parent class Exception handler."+e);
		}
	}
}