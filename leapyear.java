import java.lang.*;
import java.util.Scanner;

class leapyear
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the year:");
		int year =in.nextInt();
		if(year%400==0 && year%100==0)
		{
			System.out.println("given year is leap year");
		}
		else if(year%4==0 && year%100!=0)
		{
			System.out.println("given year is leap year");
		}
		else
		{
			System.out.println("given year is not leap year");
		}
	}
}