/**
 * @author Hugo Ramirez Jr.
 * @date 12/20/2025
 * @Module_3 - removeDuplicates from arrayList
 * @description This program creates an ArrayList of 50 random integers between 1 and 20,
 * then prints the list after removing duplicates using a method called removeDuplicates.
 */
package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Create list of random numbers
        ArrayList<Integer> randomNums = new ArrayList<Integer>();   
        for (int i = 0; i < 50; i++) {
            randomNums.add((int)(Math.random() * 20) + 1);
        }

        // Print original list
        System.out.println("Original List: ");
        System.out.println(randomNums);

        // Print list after removing duplicates
        System.out.println("\n" + "List after removing duplicates: ");
        System.out.println(removeDuplicates(randomNums));
    }
    
    public static <T> List<T> removeDuplicates(List<T> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }
}

