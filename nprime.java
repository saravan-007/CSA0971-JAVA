import java.io.*;
import java.util.Scanner;

class nprime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n,j,s=0;
        System.out.println("Enter the number:");
        n=in.nextInt();
		int arr[] = new int[1000];
		int arr2[] = new int[1000];
        for(i=1;i<=1000;i++)
		{
		int count=1;
		for(j=2;j<=1000;j++)
		{
		if(i%j==0)
		{
		count++;
		}
		
		}
		if(count==2)
		{
		arr[s]=i;
		}
		s++;
		}
		j=0;
		for(i=0;i<1000;i++){
		if(arr[i]!=0)
		{
			arr2[j]=arr[i];
			j++;
		}
		}
		System.out.println(n+"rd prime number is:"+arr2[n-1]);
		System.out.print(n+"prime numbers after:"+arr2[n-1]+" is:");
		j=n-1;
		for(i=0;i<n;i++)
		{
			
			System.out.print(arr2[j]+",");
			j++;
			
		}
		
		
    }
}