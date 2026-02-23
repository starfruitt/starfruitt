import java.util.Scanner;  

public class CalculateInvestment {  
    public static void main(String[] args) {  
        // Create a Scanner object to read input  
        Scanner input = new Scanner(System.in);  

        // Prompt the user to enter the investment amount  
        System.out.print("Enter the investment amount: ");  
        double investmentAmount = input.nextDouble();  

        // Prompt the user to enter the annual interest rate (in percentage)  
        System.out.print("Enter the annual interest rate (in %): ");  
        double annualInterestRate = input.nextDouble();  

        // Prompt the user to enter the number of years  
        System.out.print("Enter the number of years: ");  
        int numberOfYears = input.nextInt();  

        // Calculate the monthly interest rate  
        double monthlyInterestRate = annualInterestRate / 100 / 12;  

        // Calculate the future investment value  
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);  

        // Display the future investment value  
        System.out.printf("The future investment value is: %.2f%n", futureInvestmentValue);  
    }  
}