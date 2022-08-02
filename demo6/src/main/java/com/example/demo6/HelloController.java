package com.example.demo6;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
  @FXML
  ImageView myImageView;
  Button myButton;

  Image myImage=new Image(getClass().getResourceAsStream("shrek2.jpg"));

  public void displayImage(){
    myImageView.setImage(myImage);
  }

}