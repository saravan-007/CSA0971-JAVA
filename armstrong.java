import java.lang.*;
import java.util.Scanner;

class armstrong
{
	public static void main(String args[])
	{
		int i,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = in.nextInt();
		int temp = n;
		while(temp!=0)
		{
			i=temp%10;
			sum=sum+(i*i*i);
			temp=temp/10;
		}
		if(sum==n)
		{
			System.out.println(n+" is armstrong number");
		}
		else
		{
			System.out.println(n+" is not a armstrong number");
		}
	}
}