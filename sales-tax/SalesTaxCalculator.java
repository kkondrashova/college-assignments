// Programmer: Kateryna Kondrashova
// Date: 01/29/2024
// Purpose: This program calculates sale tax
// Course: COP1000C (Murtaza)

import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Declare constant variables for tax rates
        final double StateTaxRate = 0.04;
        final double CountyTaxRate = 0.02;
        final double PricePerPound = 2.0;

        // Get user input for purchase weight
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the weight of the purchase in pounds: ");
        double purchaseWeight = scanner.nextDouble();

        // Caculate purchase amount
        double purchaseAmount = purchaseWeight * PricePerPound;

        // Calculate state tax
        double stateTax = purchaseAmount * StateTaxRate;

        // Calculate county tax
        double countyTax = purchaseAmount * CountyTaxRate;

        // Calculate total tax
        double totalTax = stateTax + countyTax;

        // Calculate total sale amount
        double totalSale = purchaseAmount + totalTax;

        // Display outputs
        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("State Tax: $" + stateTax);
        System.out.println("County Tax: $" + countyTax);
        System.out.println("Total Tax: $" + totalTax);
        System.out.println("Sale total: $" + totalSale);

        scanner.close();
    }
}
