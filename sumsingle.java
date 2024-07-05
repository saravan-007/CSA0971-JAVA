import java.lang.*;
import java.util.Scanner;

class sumsingle
{
	public static void main(String args[])
	{
		int i,sum=0,digit=0,sum2=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = in.nextInt();
		int temp = n;
		while(temp!=0)
		{
			i=temp%10;
			sum+=i;
			temp=temp/10;
		}
		temp=sum;
		while(temp!=0)
		{
			int x=temp%10;
			sum2+=x;
		    temp=temp/10;
		}
	
		
		System.out.println("sum:"+sum2);
	}
}