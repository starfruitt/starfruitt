import java.util.Scanner;

public class ComputeDistance
{
    public static void main(String[] args)
    {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter the first set of values 
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
       
       //Prompt the user to enter the second set of values
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        
        //Calculate the distance using the formula
        double distance = (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        // Display the result
        System.out.println("The distance between the two points is: " + distance);
    }
}