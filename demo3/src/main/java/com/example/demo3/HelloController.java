package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

  private Stage stage;
  private Scene scene;
  private Parent root;

  public void switchToScene1(ActionEvent e) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
    stage= ((Stage) (((Node) e.getSource())).getScene().getWindow());
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void switchToScene2(ActionEvent e) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("hello2.fxml"));
    stage= ((Stage) (((Node) e.getSource())).getScene().getWindow());
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
  }
}