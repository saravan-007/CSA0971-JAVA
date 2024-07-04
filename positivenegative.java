import java.lang.*;
import java.util.Scanner;

class positivenegative
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		int a =in.nextInt();
		if(a>0)
		{
			System.out.println(a+" is positive");
		}
		else if(a<0)
		{
			System.out.println(a+" is negative");
		}
		else if(a==0)
		{
			System.out.println(a+" is zero");
		}
		else
		{
			System.out.println("please enter valid input");
		}
			
	}
}