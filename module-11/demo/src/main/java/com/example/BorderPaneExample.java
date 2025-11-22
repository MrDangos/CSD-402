package com.example;
/*
 * BorderPaneExample.java
 * Author: Hugo Ramirez
 * Date: 2025-11-22
 * Description: Demonstrates BorderPane layout. Five areas are used:
 * top, left, center, right, and bottom. Each area contains a simple control
 * so you can see how BorderPane stretches or aligns its children.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("BorderPane Example");

        BorderPane border = new BorderPane();

        // Top: a centered label
        Label topLabel = new Label("Top Area - Title");
        BorderPane.setAlignment(topLabel, Pos.CENTER);
        BorderPane.setMargin(topLabel, new Insets(10));
        border.setTop(topLabel);

        // Left: a vertical list
        ListView<String> leftList = new ListView<>();
        leftList.getItems().addAll("Item A","Item B","Item C");
        border.setLeft(leftList);

        // Center: main button
        Button centerBtn = new Button("Center Content");
        border.setCenter(centerBtn);

        // Right: another list
        ListView<String> rightList = new ListView<>();
        rightList.getItems().addAll("Option 1","Option 2");
        border.setRight(rightList);

        // Bottom: status label
        Label bottomLabel = new Label("Bottom - Status");
        BorderPane.setMargin(bottomLabel, new Insets(8));
        border.setBottom(bottomLabel);

        Scene scene = new Scene(border, 600, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
