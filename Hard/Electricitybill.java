import java.util.Scanner;

class Consumer {
    int consumerNo;
    String consumerName;
    int previousMonthReading;
    int currentMonthReading;
    double billAmount;

    public Consumer(int consumerNo, String consumerName, int previousMonthReading, int currentMonthReading) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
    }

    public void computeBill() {
        int unitsConsumed = currentMonthReading - previousMonthReading;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1;
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 1 + (unitsConsumed - 100) * 2.5;
        } else if (unitsConsumed <= 500) {
            billAmount = 100 * 1 + 100 * 2.5 + (unitsConsumed - 200) * 4;
        } else {
            billAmount = 100 * 1 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
        }
    }

    public void displayBill() {
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + previousMonthReading);
        System.out.println("Current Month Reading: " + currentMonthReading);
        System.out.println("Units Consumed: " + (currentMonthReading - previousMonthReading));
        System.out.println("Bill Amount: Rs. " + billAmount);
    }
}

public class Electricitybill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Consumer No: ");
        int consumerNo = scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();
        
        System.out.print("Enter Previous Month Reading: ");
        int previousMonthReading = scanner.nextInt();
        
        System.out.print("Enter Current Month Reading: ");
        int currentMonthReading = scanner.nextInt();

        Consumer consumer = new Consumer(consumerNo, consumerName, previousMonthReading, currentMonthReading);
        consumer.computeBill();
        consumer.displayBill();
    }
}
