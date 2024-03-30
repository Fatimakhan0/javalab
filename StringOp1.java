class StringOp1
{
	public static void main(String[] ar)
	{
		String str="tomorrow";
		System.out.println(str.indexOf('u'));
		System.out.println(str.indexOf('o',3));
		String subString="tom";
		System.out.println(str.indexOf(subString));
		System.out.println(str.indexOf(subString,7));
	}
}
