import java.lang.*;
import java.util.Scanner;

class largest
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the first number:");
		int a =in.nextInt();
		System.out.println("enter the second number:");
		int b =in.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else
		{
			System.out.println(b+" is greater");
		}
	}
}