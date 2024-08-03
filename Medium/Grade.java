import java.util.Scanner;
class Grade
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m1,m2,m3,m4;
        System.out.print("Enter the marks in java:");
        m1=in.nextInt();
		System.out.print("Enter the marks in c programming:");
        m2=in.nextInt();
		System.out.print("Enter the marks in Mathematics:");
        m3=in.nextInt();
		System.out.print("Enter the marks in Physics:");
        m4=in.nextInt();
		int Total=m1+m2+m3+m4;
		float D= Total/4;
		System.out.println("Total="+Total);
		System.out.println("Aggregate="+D);
		if(D>75)
		{
			System.out.println("DISTINCTION");
		}
		else if(D>=60 && D<75)																																																																	
			
		{
			System.out.println("FIRST DIVISION");
		}
		else if(D>=50 && D<60)
		{
			System.out.println("SECOND DIVISION");
		}
		else if(D>=40 && D<50)
		{
			System.out.println("THIRD DIVISION");
		}
		else
		{
			System.out.println("Fail");
		}
		
			
    }
} 