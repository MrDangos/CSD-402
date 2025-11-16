package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 11/16/2025
 * @Module_10 - division_project
 * @description This abstract class represents a Division with common attributes and methods.
 */

public abstract class Division {
    protected String divisionName;
    protected String accountNumber;

    public Division(String divisionName, String accountNumber) 
    {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}

