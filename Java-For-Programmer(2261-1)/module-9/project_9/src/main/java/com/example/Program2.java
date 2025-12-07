package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 11/9/2025
 * Module 9 - program 2
 * @description This program creates a file, writes random numbers to it, and then reads and displays the content.
 */
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        try {
            // Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending numbers...");
            }

            // Write or append 10 random numbers to the file
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // generate a random number 0–99
                writer.write(num + " ");
            }
            writer.close();
            System.out.println("Successfully wrote 10 random numbers to the file.");

            // Now read the file and display its content
            System.out.println("\nReading from file:");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        }
    }
}
