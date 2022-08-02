package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerTwo {
  @FXML
  Label nameLabel;
  public void displayName(String username){
    nameLabel.setText("Hello: "+username);
  }
}
