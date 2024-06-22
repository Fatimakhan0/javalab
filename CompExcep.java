class CompExcep
{
	public static void main(String[] args)
	{
		String className= "CompExcp";
		try
		{
			Class<?> clz=Class.forName(className);
			System.out.println("Class loaded successfully:"+clz.getName());	
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Class not found:"+className);
		}
	}
}