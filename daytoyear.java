import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;


public class daytoyear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Convert days to years, weeks, and days
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        if (days >= 0) {
            int years = days / 365;
            int remainingDays = days % 365;
            int weeks = remainingDays / 7;
            int finalDays = remainingDays % 7;

            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + finalDays);
        } else {
            System.out.println("Invalid input: Days cannot be negative.");
        }

        // Part 2: Find the day of the week for a given date
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
		LocalDate date= LocalDate.of(year,month,day);
		DayOfWeek dayofWeek=date.getDayOfWeek();
		String dayname= dayofWeek.name();
		System.out.println("The day is : "+dayname);
        
    }

    
}