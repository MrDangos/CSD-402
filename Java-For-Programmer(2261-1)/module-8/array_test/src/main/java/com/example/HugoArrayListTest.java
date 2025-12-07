package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 11/2/2025
 * Module 8 - ArrayListTest
 * @description Tests the functionality of the max method in the Main class.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class HugoArrayListTest {

    public static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        // Get user input
        while (true) {
            Integer num = input.nextInt();
            numbers.add(num);
            if (num == 0) {
                break;
            }
        }

        // Call the max method
        Integer largest = max(numbers);

        // Display the result
        System.out.println("The largest value in the list is: " + largest);
    }

    // Method to find the maximum value in an ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0; // Return 0 if list is empty
        }

        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

}