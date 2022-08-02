package com.example.demo5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
    stage.setOnCloseRequest(windowEvent -> {
      windowEvent.consume();
      logoutAction(stage);
    });
  }

  public static void main(String[] args) {
    launch();
  }

  public void logoutAction(Stage stage) {
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Logout");
    alert.setHeaderText("You're about to logout!");
    alert.setContentText("Do you want to save before exiting?:");

    if (alert.showAndWait().get() == ButtonType.OK) {
      System.out.println("You successfully logged out!");
      stage.close();
    }
  }
}