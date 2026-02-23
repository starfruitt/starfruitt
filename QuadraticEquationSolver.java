import java.util.Scanner;

public class QuadraticEquationSolver
{
	public static void main(String[] args) 
	{
	    //Create a Scanner object
	    Scanner input = new Scanner(System.in);
	    
	    //Prompt user to enter coefficients a, b, c
	    System.out.print("Enter a, b, c: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();
	    
	    //Calculate
	    double discriminant = b * b - 4 * a * c;
	    
	    //Determine the roots based on the discriminant
	    if (discriminant > 0)
	    {
	        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
	        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
	        System.out.printf("The equation has two roots: %.6f and %.6f\n", r1, r2);
	    }
	    else if (discriminant == 0)
	    {
	        double root = -b / (2 * a);
	        System.out.printf("The equation has one root: %.6f\n", root);
	    }
	    else
	    {
	        System.out.println("The equation has no real roots.");
	    }
	}
}
