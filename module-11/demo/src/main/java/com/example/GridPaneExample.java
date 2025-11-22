package com.example;
/*
 * GridPaneExample.java
 * Author: Hugo Ramirez
 * Date: 2025-11-22
 * Description: A simple JavaFX application demonstrating GridPane usage.
 * The program builds a basic login-style form using Labels and TextFields
 * and places them in a GridPane using column and row indices.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GridPane Example - Simple Login Form");

        // Create the GridPane and set gaps and padding
        GridPane grid = new GridPane();
        grid.setHgap(10);   // horizontal gap between columns
        grid.setVgap(10);   // vertical gap between rows
        grid.setPadding(new Insets(15)); // outer padding

        // Add nodes to specific column,row positions
        Label userLabel = new Label("Username:");
        TextField userField = new TextField();
        Label passLabel = new Label("Password:");
        PasswordField passField = new PasswordField();
        Button loginBtn = new Button("Log in");

        grid.add(userLabel, 0, 0); // col 0, row 0
        grid.add(userField, 1, 0); // col 1, row 0
        grid.add(passLabel, 0, 1); // col 0, row 1
        grid.add(passField, 1, 1); // col 1, row 1
        grid.add(loginBtn, 1, 2);  // col 1, row 2

        // Create the scene and show
        Scene scene = new Scene(grid, 350, 180);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
