import java.lang.*;
import java.util.Scanner;

class factors
{
	public static void main(String args[])
	{
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = in.nextInt();
		System.out.print("factors:");
		for(i=1;i<=n;i++)
		{
		if(n%i==0)
		{
		System.out.print(i+",");
		}
		}
		
	}
}