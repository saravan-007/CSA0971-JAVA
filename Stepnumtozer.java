import java.util.*;

class Stepnumtozer{
public static void main(String [] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter the number:");
int n= in.nextInt();
int steps=0;
while(n>0)
{
if(n%2==0)
{
n/=2;
}
else
{
n-=1;
}
steps++;
}
System.out.print("number of steps:"+steps);
}
}