package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 11/8/2025
 * Module 9 - program 1
 * @description This program creates an ArrayList of Strings containing the names of fruits.
 * It then prompts the user to enter a number between 1 and 11 to select a fruit from the list.
 * The program handles exceptions for out-of-bounds indices and invalid input formats.
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Program1 {

    public static Scanner input;

    public static void main(String[] args) {
        // ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Grape");
        fruits.add("Watermelon");
        fruits.add("Kiwi");
        fruits.add("Lemon");
        fruits.add("Peach");

        // Print all elements using a for-each loop
        System.out.println("Here are the fruits in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        input = new Scanner(System.in);
        System.out.print("\nEnter the 1-11 of the fruit you'd like to see again: ");

        String inputStr = input.nextLine();
        try {
            // converting String -> Integer 
            Integer index = Integer.parseInt(inputStr);
            int correctIndex = index - 1;
            // display fruit at the index
            System.out.println("Fruit " + index + ": " + fruits.get(correctIndex));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: please enter a number.");
        }
    }
}