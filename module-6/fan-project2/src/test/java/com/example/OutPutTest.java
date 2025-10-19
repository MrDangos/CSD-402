package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 10/19/2025
 * Module 6 - Fan Project
 * @description this program tests the Fan class by creating Fan objects,
 */
public class OutPutTest {
        public static void main(String[] args) {
        // Create first fan using default constructor
        Fan fan1 = new Fan();

        // Create second fan using constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Display both fans
        System.out.println("Fan 1:");
        System.out.println(fan1.toString());
        System.out.println();

        System.out.println("Fan 2:");
        System.out.println(fan2.toString());
        System.out.println();

        // Modify fan1's attributes
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("green");
        fan1.setRadius(8);

        System.out.println("Fan 1 after changes:");
        System.out.println(fan1.toString());
    }
}
