import java.util.Scanner;

class Empbonus
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int salary,bonus=0;
        System.out.print("Enter the salary:");
        salary=in.nextInt();
		char grade;
		System.out.print("Enter the grade A/B:");
        grade=in.next().charAt(0);
		if(salary>10000 &&(grade=='a'||grade=='A'))
		{
			bonus=salary*5/100;
		}
		else if(salary>10000 &&(grade=='a'||grade=='A'))
		{
			bonus=salary*5/100;
		}
		else if(salary>10000 &&(grade=='b'||grade=='B'))
		{
			bonus=salary*10/100;
		}
		else if(salary<10000 &&(grade=='b'||grade=='B'))
		{
			bonus=salary*12/100;
		}
		else
		{
			System.out.println("please enter valid input");
		}
		System.out.println("Salary="+salary);
		System.out.println("Bonus="+bonus);
		System.out.println("Total To Be Paid:"+(salary+bonus));
		
		
    }
}