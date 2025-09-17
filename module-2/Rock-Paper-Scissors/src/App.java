// Hugo Ramirez Jr.
// Date: 9/17/2025
// Assignment: M2 Programming Assignment
// Description: This program allows the user to play Rock, Paper, Scissors against the computer.
import java.util.Scanner;
import java.util.Random;

public class App {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // Computer choice: 1 = Rock, 2 = Paper, 3 = Scissors
        int computerNumber = random.nextInt(3) + 1; 
        // Convert computer choice into words
        String computerChoice = numberToWords(computerNumber);

        System.out.println("\nLet's play Rock, Paper, Scissors");
        // Get user input through method
        int userNumber = getUserInput(userInput);
       
        // Checks user input
        while (userNumber < 1 || userNumber > 3) {
            System.out.println("\nInvalid choice. Please choose 1, 2, or 3.");
            userNumber = getUserInput(userInput);
        }
        // Convert user choice into words
        String userChoice = numberToWords(userNumber);

        // Determine winner method
        determineWinner(userNumber, computerNumber, userChoice, computerChoice);
    }
    public static int getUserInput(Scanner userInput) {
        System.out.println("\nChoose 1 for Rock");
        System.out.println("Choose 2 for Paper"); 
        System.out.println("Choose 3 for Scissors");       
        int userNumber = userInput.nextInt();
        return userNumber;
    }

    public static String numberToWords(int number) {
        // Convert number to corresponding word
        switch (number) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }

    public static void determineWinner(int userNumber, int computerNumber, String userChoice, String computerChoice) {
        // Determine winner and display results
        if (userNumber == computerNumber) {
            System.out.println("\nIt's a tie!");
            System.out.println("You both chose " + userChoice + " :|");
        } else if ((userNumber == 1 && computerNumber == 3) ||
                (userNumber == 2 && computerNumber == 1) ||
                (userNumber == 3 && computerNumber == 2)) {
            System.out.println("\nYou win!");
            System.out.println("Computer chose " + computerChoice);
            System.out.println("You chose " + userChoice + " lucky :)");
        } else {
            System.out.println("\nComputer wins!");
            System.out.println("Computer chose " + computerChoice);
            System.out.println("You chose " + userChoice + " unlucky :(");
        }
    }
}
