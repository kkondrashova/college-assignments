import java.util.Scanner;

public class CookieCalorieCalculator {
    public static void main(String[] args) {
        // ask the user for input
        System.out.print("Enter the number of cookies eaten: ");

        // look at the users input and store it in numCookies
        Scanner scanner = new Scanner(System.in);
        int numCookies = scanner.nextInt();

        // calculate total calories by multiplying numCookies by 70 (amount of calories per 1 cookie)
        int totalCalories = numCookies * 70;

        // display the result
        System.out.println("Total calories consumed: " + totalCalories);

        scanner.close();
    }
}
