/**
 * @author Hugo Ramirez Jr.
 * @date 12/7/2025
 * Module 1 - Card Shuffle FX
 * @description A JavaFX application that displays four random playing cards
 */
package com.example;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

public class RandomCards extends Application {

  private Random random = new Random();
  private HBox cardPane = new HBox(10);

  @Override
  public void start(Stage primaryStage) {
    cardPane.setPadding(new Insets(5, 5, 5, 5));
    cardPane.setAlignment(Pos.CENTER); 

    // Initial draw
    drawCards();

    // Create Refresh button
    Button refreshButton = new Button("Refresh");
    refreshButton.setOnAction(e -> drawCards());

    // Put button in an HBox to center it
    HBox buttonBox = new HBox(refreshButton);
    buttonBox.setAlignment(Pos.CENTER);
    buttonBox.setPadding(new Insets(10));

    // Use BorderPane to arrange layout
    BorderPane root = new BorderPane();
    root.setCenter(cardPane);   
    root.setBottom(buttonBox); 

    // Create Scene, place in Stage
    Scene scene = new Scene(root, 400, 300);
    primaryStage.setTitle("Random Cards");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void drawCards() {
    cardPane.getChildren().clear(); // remove old cards
    for (int i = 0; i < 4; i++) {
      int cardNumber = random.nextInt(52) + 1; 
      ImageView cardView = new ImageView(new Image("cards/" + cardNumber + ".png"));
      cardPane.getChildren().add(cardView);
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
