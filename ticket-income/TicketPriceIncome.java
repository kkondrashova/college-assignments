import java.util.Scanner;

// main module
public class TicketPriceIncome {
    public static void main(String[] args) {
        // Declare variables to store the number of tickets for each class
        Double countA, countB, countC;

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the count of A seats: ");
        countA = scanner.nextDouble();

        System.out.print("enter the count of B seats: ");
        countB = scanner.nextDouble();

        System.out.print("enter the count of C seats: ");
        countC = scanner.nextDouble();

        currentIncome(countA, countB, countC);

        scanner.close();
    }

    // 2nd module
    public static void currentIncome(double countA, double countB, double countC) {
        // Declare constants for ticket prices
        double priceA = 15.00;
        double priceB = 12.00;
        double priceC = 9.00;

        // Calculate income for class A
        double incomeA = countA * priceA;
        // Calculate income for class B
        double incomeB = countB * priceB;
        // Calculate income for class C
        double incomeC = countC * priceC;
        // Calculate total income
        double totalIncome = incomeA + incomeB + incomeC;

        // Display the income for each class and the total income
        System.out.println("Income from A Seats: " + incomeA);
        System.out.println("Income from B Seats: " + incomeB);
        System.out.println("Income from C Seats: " + incomeC);
        System.out.println("Total income: " + totalIncome);
    }
}
