/**
 * @author Hugo Ramirez Jr.
 * @date 2/7/20265
 * Module 7 - CSS Cycles
 * @description This program shows the use of CSS in JavaFX to style circles 
 * and their borders. It creates a simple user interface with two panes, 
 * each containing circles that are styled using CSS classes and IDs defined 
 * in an external stylesheet.
 */
package com.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class App extends Application {

  @Override
  public void start(Stage primaryStage) {

    HBox hBox = new HBox(5);
    hBox.setPadding(new Insets(0,16,0,16));
    
    Scene scene = new Scene(hBox, 300, 250);    
    scene.getStylesheets().add(getClass().getResource("mystyle.css").toExternalForm());
    HBox pane1 = new HBox();
    Circle circle1 = new Circle(100, 100, 30);
    circle1.getStyleClass().addAll("circleborder", "plainCircle"); 
    pane1.getChildren().add(circle1);
    pane1.getStyleClass().add("border");
    pane1.setAlignment(Pos.CENTER); 


    
    HBox pane2 = new HBox(5);
    Circle circle2 = new Circle(0, 0, 30);
    Circle circle3 = new Circle(0, 0, 30);
    Circle circle4 = new Circle(0, 0, 30);
    pane2.getChildren().addAll(circle2, circle3, circle4);
    circle2.getStyleClass().addAll("circleborder", "plainCircle"); 
    circle3.setId("redcircle");
    circle4.setId("greencircle");
    pane2.setAlignment(Pos.CENTER); 

    hBox.getChildren().addAll(pane1, pane2); 
    primaryStage.setTitle("CSS Cycles");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
