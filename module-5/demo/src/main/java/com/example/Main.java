package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File file = new File("collection_of_words.txt");

        TreeSet<String> fruitList = new TreeSet<>();

        try {
            scanner = new Scanner(new FileReader(file));
            while (scanner.hasNext()) {
                String word = scanner.next(); 
                fruitList.add(word); 
            }


            System.out.println("Sorted words in ascending order: " + fruitList);
            System.out.println("Sorted words in descending order: " + fruitList.descendingSet());

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + file.getName() + "' was not found.");
            e.printStackTrace();
        }
    }
}