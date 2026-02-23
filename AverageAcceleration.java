/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Assuming you named the file ComputeAreaWithConstant.java

import java.util.Scanner;

public class AverageAcceleration
{
	public static void main(String[] args)
	{
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter values for v0 and v1
		System.out.print("Enter the starting velocity in meters/seconds: ");
		double v0 = input.nextDouble();
		
		System.out.print("Enter the ending velocity in meters/seconds: ");
		double v1 = input.nextDouble();
		
		//Prompt the user to enter the time span(t)
		System.out.print("Enter the time in seconds: ");
		double t = input.nextDouble();
		
		//Compute the average acceleration
		double averageAcceleration = (v1 - v0) / t;
		
		//Display result
		System.out.println("The average acceleration is: " + averageAcceleration + " meters/second).");
	}		
}