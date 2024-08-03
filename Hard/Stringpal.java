import java.io.*;
import java.util.Scanner;

class Stringpal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i;
		String str,rstr="";
		char ch;
        System.out.print("Enter the String:");
        str=in.next();
        for(i=0;i<str.length();i++)
		{
		ch=str.charAt(i);
		rstr=ch+rstr;
		}
		if(str.equals(rstr))
		{
		System.out.println("pallindrome");
		}
		else
		{
		System.out.println("not pallindrome");
		}	
    }
}