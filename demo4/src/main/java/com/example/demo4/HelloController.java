package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
  @FXML
  TextField nameTextField;

  private Stage stage;
  private Scene scene;
  private Parent root;

  public void login(ActionEvent event) throws IOException {
    String username=nameTextField.getText();
    FXMLLoader loader=new FXMLLoader(getClass().getResource("Scene2.fxml"));
    root=loader.load();

    ControllerTwo controllerTwo=loader.getController();
    controllerTwo.displayName(username);

    stage= ((Stage) ((Node) event.getSource()).getScene().getWindow());
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