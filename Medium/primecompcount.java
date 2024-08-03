import java.io.*;
import java.util.Scanner;

class primecompcount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n,j,prime=0,comp=0;
        System.out.print("Enter list size:");
        n=in.nextInt();
		int arr[] = new int[n];
        for(i=0;i<n;i++)
		{
		System.out.print("enter the element:");
		int ele = in.nextInt();
		arr[i]=ele;
		}
		for(i=0;i<n;i++)
		{
			int count=1;                                                               
		for(j=2;j<=arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				count+=1;
			}
		}
		if(count==2)
		{
			prime+=1;
		}
		else
		{
			comp+=1;
		}
		
		}
		System.out.println("prime count:"+prime);
		System.out.println("comp count:"+comp);
		
		
		
    }
}