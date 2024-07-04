import java.lang.*;
import java.util.Scanner;

class skippingknum
{
	public static void main(String args[])
	{
		int m,n,k,i;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the value of m:");
		m= in.nextInt();
		System.out.println("enter the value of n:");
		n= in.nextInt();
		System.out.println("enter the value of k:");
		k= in.nextInt();
		System.out.println("sample output:");
		for(i=m;i<=n;i+=k)
		{
			System.out.print(i+",");
		}
	}
}