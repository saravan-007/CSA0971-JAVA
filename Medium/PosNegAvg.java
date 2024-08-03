import java.util.Scanner;
class PosNegAvg
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		double pavg=0,navg=0;
		int pos=0,neg=0;
		int p=0,n=0;
		System.out.println("Enter -1 to exit…");
		while(true)
		{
		System.out.print("Enter the number:");
		int ele=in.nextInt();
		if(ele==-1)
		{
		break;
		}
		else
		{
		if(ele>0)
		{
		pos+=ele;
		p++;
		}
		else
		{
		neg+=ele;
		n++;
		}
		}
		}
		pavg=(double)pos/p;
		navg=(double)neg/n;
		System.out.println("Positive avg:"+pavg);
		System.out.println("Negative avg:"+navg);
    }
}