import java.util.Scanner;  

public class AreaOfTriangle 
{  
    public static void main(String[] args) 
    {  
        // Create a Scanner object to read input  
        Scanner input = new Scanner(System.in);  

        // Prompt the user to enter the coordinates of the three points  
        System.out.print("Enter x1, y1: ");  
        double x1 = input.nextDouble();  
        double y1 = input.nextDouble();  

        System.out.print("Enter x2, y2: ");  
        double x2 = input.nextDouble();  
        double y2 = input.nextDouble();  

        System.out.print("Enter x3, y3: ");  
        double x3 = input.nextDouble();  
        double y3 = input.nextDouble();  

        // Calculate the area of the triangle  
        double area = Math.abs(  
                x1 * (y2 - y3) +  
                x2 * (y3 - y1) +  
                x3 * (y1 - y2)  
        ) / 2.0;  

        // Display the area  
        System.out.println("The area of the triangle is: " + area);  
    }  
}