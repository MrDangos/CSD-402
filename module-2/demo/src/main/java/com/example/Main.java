package com.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[] intArray = new int[5];
        double[] doubleArray = new double[5];

        // Generate random integers
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100); // 0–99
        }

        // Generate random doubles
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = random.nextDouble() * 100;
        }

        try (FileWriter writer = new FileWriter("Hugo_datafile.dat", true)) {
            writer.write("Integers:\n");
            for (int num : intArray) {
                writer.write(num + " ");
            }

            writer.write("\nDoubles:\n");
            for (double num : doubleArray) {
                writer.write(String.format("%.2f ", num));
            }

            writer.write("\n---------------------\n");

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
}