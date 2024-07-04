import java.lang.*;

class factorial
{
	public static void main(String args[])
	{
		int n=5,i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("factorial:"+fact);
		
	}
}