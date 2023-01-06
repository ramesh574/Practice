package com.example.helloworldfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader (HelloApplication.class.getResource("hello-view.fxml"));
      // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
       GridPane root =new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        Label greeting=new Label("Welcome to java Fx");
        greeting.setTextFill(Color.GREEN);
        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD,70));
        root.getChildren().add(greeting);
        stage.setTitle("Hello!");
        stage.setScene(new Scene(root,700,275));
       // stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}