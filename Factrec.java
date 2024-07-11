import java.util.Scanner;
class Factrec
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,fact;
        System.out.print("Enter the number:");
        n=in.nextInt();
		fact=getfact(n);
		if(fact==-1)
		{
		System.out.print("factorial cannot be find for negative number");
		}
		else
		{
		System.out.print("factorial:"+fact);
		}
		
    }
	public static int getfact(int n){
	if(n<0)
	{
	return -1;
	}
	else if(n==0 || n==1)
	{
	return 1;
	}
	else
	{
	 return n*getfact(n-1);
	}
	}
}