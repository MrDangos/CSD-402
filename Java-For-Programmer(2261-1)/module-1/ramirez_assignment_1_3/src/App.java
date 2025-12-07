// Hugo Ramirez Jr.
// Date: 9/14/2025
// Assignment: M1 Programming Assignment
// Description: This program calculates the energy needed to heat water based on user input.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        // User inputs
        System.out.print("\nEnter the amount of water in kilograms: ");
        double waterMass = userInput.nextDouble();

        System.out.print("\nEnter the initial temperature in Celsius: ");
        double initialTemp = userInput.nextDouble();

        System.out.print("\nEnter the final temperature in Celsius: ");
        double finalTemp = userInput.nextDouble();

        // Calculation
        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        // Display output
        System.out.printf("\nThe energy needed to heat the water is %.2f Joules.", Q);

    }
}

