/**
command line arguments
*/
class Wrapper {
 public static void main(String[] ar)
 {
  System.out.println("Welcome "+ar[0]);
  float a=Float.parseFloat(ar[1]);
  float b=Float.parseFloat(ar[2]);
  System.out.println(a+b);
 }
}