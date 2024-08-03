import java.util.*;

class Student{
public int cp,pp,m,c,p,e;
public int total;
public double aggregate;
public void marks()
{
Scanner in = new Scanner(System.in);
System.out.print("Enter the c program mark:");
cp=in.nextInt();
System.out.print("Enter the python program mark:");
pp=in.nextInt();
System.out.print("Enter the maths mark:");
m=in.nextInt();
System.out.print("Enter the physics mark:");
p=in.nextInt();
System.out.print("Enter the chemistry mark:");
c=in.nextInt();
System.out.print("Enter the ethics mark:");
e=in.nextInt();
}
public void calanddis()
{
total=cp+pp+p+c+m+e;
aggregate=total/6.0;
System.out.println("Total marks:"+total);
System.out.printf("Aggregate:%.2f\n",aggregate);
}
public void checkgrade() {
        if (aggregate > 75) {
            System.out.println("Class: DISTINCTION");
        } else if (aggregate > 60) {
            System.out.println("Class: FIRST DIVISION");
        } else if (aggregate > 50) {
            System.out.println("Class: SECOND DIVISION");
        } else if (aggregate > 40) {
            System.out.println("Class: THIRD DIVISION");
        } else {
            System.out.println("Class: FAIL");
        }
    }
}
class StudentGrades
{
public static void main(String [] args)
{
Student grade = new Student();
grade.marks();
grade.calanddis();
grade.checkgrade();
}
}