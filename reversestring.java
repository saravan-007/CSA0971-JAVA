import java.io.*;
import java.util.Scanner;

class reversestring
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i;
		String str,rstr="";
		char ch;
        System.out.println("Enter the String:");
        str=in.next();
        for(i=0;i<str.length();i++)
		{
		ch=str.charAt(i);
		rstr=ch+rstr;
		}
		System.out.println("reverse string:"+rstr);
		
    }
}