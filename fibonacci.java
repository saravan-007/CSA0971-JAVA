import java.lang.*;

class fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1,c,count=2,n=5;
		System.out.println("fibonacci series:");
		System.out.println(a);
		System.out.println(b);
		while(count<n)
		{
		  c=a+b;
		  a=b;
		  b=c;
		  System.out.println(c);
		  count+=1;
		}
		
	}
}