import java.lang.*;
import java.util.Scanner;

class palindrome
{
	public static void main(String args[])
	{
		int i,rev=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = in.nextInt();
		int temp = n;
		while(temp!=0)
		{
			i=temp%10;
			rev=rev*10+i;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println(n+" is palindrome number");
		}
		else
		{
			System.out.println(n+" is not a palindrome number");
		}
	}
}