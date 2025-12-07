package com.example;

/**
 * This program shows a Circle and an Arc in JavaFX.
 * The shapes are created, styled, and then added to a Pane.
 * JavaFX handles the rendering once the Stage is shown.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShapeDemo extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(150, 120, 60);
        circle.setFill(Color.LIGHTBLUE);
        circle.setStroke(Color.BLACK);

        Arc arc = new Arc(150, 250, 70, 70, 45, 180);
        arc.setFill(Color.CORNFLOWERBLUE);
        arc.setType(ArcType.ROUND);

        Pane pane = new Pane(circle, arc);
        stage.setScene(new Scene(pane, 300, 350));
        stage.setTitle("JavaFX Circle and Arc Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
