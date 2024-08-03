import java.util.*;
class MthmaxNthmin 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,s,t;
		int m,n;
		int arr[]={3,6,9,5,1,8};
		s=arr.length;
		System.out.print("Enter the M:");
		m=in.nextInt();
		System.out.print("Enter the N:");
		n=in.nextInt();
		for(i=0 ; i<s ;i++)
		{
			for(j=i+1 ; j<s ;j++)
			{
				if(arr[j]<arr[i])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println(m+"th max:"+arr[s-m]);
		System.out.println(n+"th min:"+arr[n-1]);
	
	}
}