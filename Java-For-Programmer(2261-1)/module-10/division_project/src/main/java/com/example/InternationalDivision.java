package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 11/16/2025
 * @Module_10 - division_project
 * @description This class represents an International Division extending the Division class.
 */

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account #: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
