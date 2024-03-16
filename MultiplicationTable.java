class MultiplicationTable
{
 public static void main(String ar[])
 {
  System.out.println("Multiplication Table:");
  int n=Integer.parseInt(ar[0]);
  for (int i=1;i<=10;i++)
  { 
   System.out.println(n+"*"+i+"="+n*i);
  }
 }
}