import java.util.Scanner;

public class ReverseAndAdd {
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        while (!isPalindrome(num)) {
            int reversedNum = reverse(num);
            int sum = num + reversedNum;
            System.out.println(num + " + " + reversedNum + " = " + sum);
            num = sum;
        }
        
        System.out.println("Palindrome: " + num);
    }
}
