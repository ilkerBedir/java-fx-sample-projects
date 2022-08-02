package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    try {
      Parent root = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
      Scene scene = new Scene(root);
      stage.setTitle("Hello!");
      stage.setScene(scene);
      stage.show();
    }catch (Exception e){
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    launch();
  }
}