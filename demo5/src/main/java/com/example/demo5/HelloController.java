package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController {
  @FXML
  private Button logout;

  @FXML
  private AnchorPane scenePane;

  Stage stage;

  public void logoutAction(ActionEvent event) {
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Logout");
    alert.setHeaderText("You're about to logout!");
    alert.setContentText("Do you want to save before exiting?:");

    if (alert.showAndWait().get()== ButtonType.OK){
      stage = (Stage) scenePane.getScene().getWindow();
      System.out.println("You successfully logged out!");
      stage.close();
    }

  }
}