import java.util.Scanner;
import java.util.ArrayList;
class Nperfect
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n,j,s=0;
        System.out.print("Enter the number:");
        n=in.nextInt();
		int arr[] = new int [1000];
		System.out.print("First "+n+" perfect numbers are:");
		for(i=2;i<=1000;i++)
		{
			
			int sum=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
				 \\sum+=j;
				}				
			}
			if(sum==i)
			{
				arr[s]=i;
				s++;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+",");
		}
		
    }
}