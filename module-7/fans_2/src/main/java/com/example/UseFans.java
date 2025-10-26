package com.example;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hugo Ramirez Jr.
 * @date 10/26/2025
 * Module 7 - Fans part 2 Project
 * @description Demonstrates a collection of Fan objects and displays them without using toString().
 */
public class UseFans {

    // Method to display a single fan without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
    }

    // Method to display a collection of fans without using toString()
    public static void displayAllFans(List<Fan> fans) {
        System.out.println("Displaying all fans:");
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {
        // Create a collection of Fan objects
        List<Fan> fanList = new ArrayList<>();
        fanList.add(new Fan()); // default constructor
        fanList.add(new Fan(Fan.FAST, true, 10, "blue"));
        fanList.add(new Fan(Fan.MEDIUM, false, 7, "green"));

        // Display all fans
        displayAllFans(fanList);
    }
}
