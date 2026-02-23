import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{

    public static void main(String[] args)
    {
        // Create Scanners
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //Declare variables 
        String[] choices = { "scissor","rock","paper"};
        
        //Prompt user input
        System.out.print("Choose from the following: scissor (0), rock (1), paper (2)");
        int userChoice = scanner.nextInt();
        
        //Randomly generate the computer's choice
        int computerChoice = (int)(Math.random() * 3);
        
        //Display computer's choice
        System.out.println("The computer is " + choices[computerChoice] + ". You are " + choices[userChoice] + ".");
        
           // Determine the result
        if (userChoice == computerChoice) {
            System.out.println("It is a draw.");
        } else if ((userChoice == 0 && computerChoice == 1) || 
                   (userChoice == 1 && computerChoice == 2) || 
                   (userChoice == 2 && computerChoice == 0)) {
            System.out.println("You lost ):");
        } else {
            System.out.println("You won! (:");
        }
    }
}