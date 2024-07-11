import java.io.*;
import java.util.Scanner;

class MthmaxNthmin
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,j,m,n,max=0,min=0,l,temp;
		System.out.print("Enter the array size:");
        l=in.nextInt();
		int arr[] = new int[l];
        for(i=0;i<l;i++)
		{
		System.out.print("enter the element:");
		int ele = in.nextInt();
		arr[i]=ele;
		}
        System.out.print("Enter the value of m:");
        m=in.nextInt();
		System.out.print("Enter the value of n:");
        n=in.nextInt();
		
		for(i=0;i<l;i++)
		{
		for(j=i+1;j<l;j++)
		{
		if(arr[i]<arr[j])
		{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}
		max=arr[m-1];
		System.out.println(m+" maximum is:"+max);
		for(i=0;i<l;i++)
		{
		for(j=i+1;j<l;j++)
		{
		if(arr[i]>arr[j])
		{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}
		min=arr[n-1];
		System.out.println(n+" minimum is:"+min);
		System.out.println("sum:"+(max+min));
		System.out.println("diff:"+(max-min));
		
		
		
    }
}