import java.lang.*;
import java.util.Scanner;

class lcmgcd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b,lcm,gcd;
        System.out.println("Enter the value of a:");
        a=in.nextInt();
		System.out.println("Enter the value of b:");
        b=in.nextInt();
        lcm=(a>b)?a:b;
        while(true)
        {
            if(lcm%a==0 && lcm%b==0)
			{
			break;
			}
			lcm++;
        }
		System.out.println("Lcm of "+a+","+b+" is:"+lcm);
		gcd=(a*b)/lcm;
		System.out.println("Gcd of "+a+","+b+" is:"+gcd);
    }
}