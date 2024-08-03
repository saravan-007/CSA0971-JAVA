import java.util.*;
class Atm
{
 public static void main(String args[])
 {
  Scanner in=new Scanner(System.in);
  int bal=0;
  for(int i=1 ; i<=4 ; i++)
  {
   System.out.print("Enter the " +i+ " denomination:");
   int a=in.nextInt();
   System.out.print("Enter the " +i+ " denomination notes:");
   int b=in.nextInt();
   bal+=a*b;
  }
   System.out.print("Balance:"+bal);
  
 }
}