import java.lang.*;
import java.util.Scanner;

class oddeven
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		int n=in.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is a even number");
		}
		else
		{
			System.out.println(n+" is a odd number");
		}
	}
}