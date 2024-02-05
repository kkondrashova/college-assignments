import java.util.Scanner;

public class CalculatePaintRequirements {
    public static void main(String[] args) {
        // Declare variable
        double wallSpace;

        // Input
        System.out.print("enter wall space in square feet: ");
        Scanner scanner = new Scanner(System.in);
        wallSpace = scanner.nextDouble();

        // Call summaryPaint module
        summaryPaint(wallSpace);
    }

}

    // Module summaryPaint
public static void summaryPaint(double wallSpace) {
    // Declare constant variables
    final double gallonCoverage = 150;
    final double hoursPerGallon = 5;
    final double costPerGallon = 20;
    final double laborRate = 20;

    // Declare local variables
    double gallonsNeeded;
    double hoursOfLabor; 
    double paintCost; 
    double laborCharges; 
    double totalCost;

    // Calculate gallons of paint needed
    gallonsNeeded = wallSpace / gallonCoverage;

    // Calculate hours of labor needed
    hoursOfLabor = gallonsNeeded * hoursPerGallon;

    // Calculate cost of paint
    paintCost = gallonsNeeded * costPerGallon;

    // Calculate labor charges
    laborCharges = hoursOfLabor * laborRate;

    // Calculate total cost
    totalCost = paintCost + laborCharges;

    // Display outputs
    System.out.println("gallons of paint:" + gallonsNeeded);
    System.out.println("hours of labor:" + hoursOfLabor);
    System.out.println("paint charges: $" + paintCost);
    System.out.println("labor charges: $" + laborCharges);
    System.out.println("total cost: $" + totalCost);
}