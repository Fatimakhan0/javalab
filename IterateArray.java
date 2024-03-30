class IterateArray
{
	public static void main(String[] ar)
	{
		int[] arr={1,2,4,5,6,7};
		CommonElement co=new CommonElement();
		System.out.println("Array 3 :");
		for(int l:co.arr3)
		{
			System.out.println(l);
		}
		System.out.println("Common elements :");
		CommonElement.main(null);
		System.out.println("Elements to be iterated are:");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}