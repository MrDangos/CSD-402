package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 11/16/2025
 * @Module_10 - division_project
 * @description This program demonstrates the use of InternationalDivision and DomesticDivision classes.
 */

public class UseDivision {
    public static void main(String[] args) {
        // Two International Divisions
        InternationalDivision intl1 = new InternationalDivision("Global Sales", "INT-1001", "Japan", "Japanese");

        InternationalDivision intl2 = new InternationalDivision("EU Operations", "INT-2002", "Germany", "German");

        // Two Domestic Divisions
        DomesticDivision dom1 = new DomesticDivision("East Coast", "DOM-3003", "New York");

        DomesticDivision dom2 = new DomesticDivision("West Coast", "DOM-4004", "California");

        // Display all                
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();    
    }
}