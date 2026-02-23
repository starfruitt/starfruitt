import java.util.Scanner;

public class ComparingRiceCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for package 1
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = scanner.nextDouble();
        double price1 = scanner.nextDouble();

        // Input for package 2
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = scanner.nextDouble();
        double price2 = scanner.nextDouble();

        // Calculate cost per unit weight for each package
        double costPerUnit1 = price1 / weight1;
        double costPerUnit2 = price2 / weight2;

        // Determine which package has the better price
        if (costPerUnit1 < costPerUnit2) {
            System.out.println("Package 1 has a better price.");
        } else if (costPerUnit1 > costPerUnit2) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Both packages have the same price.");
        }
    }
}