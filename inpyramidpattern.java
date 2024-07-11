import java.util.*;
class inpyramidpattern
{
 public static void main(String args[])
 {
  int n;
  Scanner in= new Scanner(System.in);
  System.out.println("enter the number:");
  n=in.nextInt();
  int i,j,k;
            for(i=0;i<=n;i++)
            {
                for(j=0;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(k=1;k<=n-i;k++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            
        }


  }
 