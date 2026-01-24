package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 01/23/2026
 * @Module_5 - Word Sorting 
 * @description this program reads a collection of words from a text file,
 * stores them in a TreeSet to automatically sort them in ascending order,
 * and then displays the sorted words in both ascending and descending order.
 */
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