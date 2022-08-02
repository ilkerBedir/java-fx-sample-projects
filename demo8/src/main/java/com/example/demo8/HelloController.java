package com.example.demo8;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

  @FXML
  private ImageView myImage;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    TranslateTransition translateTransition = new TranslateTransition();
    translateTransition.setNode(myImage);
    translateTransition.setDuration(Duration.millis(1000));
    translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
    translateTransition.setByX(250);
    translateTransition.setAutoReverse(true);
    translateTransition.play();
    RotateTransition rotate=new RotateTransition();
    rotate.setNode(myImage);
    rotate.setDuration(Duration.millis(1000));
    rotate.setCycleCount(TranslateTransition.INDEFINITE);
    rotate.setInterpolator(Interpolator.LINEAR);
    rotate.setByAngle(360);
    rotate.setAxis(Rotate.Z_AXIS);
    rotate.play();
    FadeTransition fade=new FadeTransition();
    fade.setNode(myImage);
    fade.setDuration(Duration.millis(1000));
    fade.setCycleCount(TranslateTransition.INDEFINITE);
    fade.setInterpolator(Interpolator.LINEAR);
    fade.setFromValue(1);
    fade.setToValue(0);
    fade.play();
    ScaleTransition scaleTransition=new ScaleTransition();
    scaleTransition.setNode(myImage);
    scaleTransition.setDuration(Duration.millis(1000));
    scaleTransition.setCycleCount(TranslateTransition.INDEFINITE);
    scaleTransition.setInterpolator(Interpolator.LINEAR);
    scaleTransition.setByX(2.0);
    scaleTransition.setByY(2.0);
    scaleTransition.setAutoReverse(true);
    scaleTransition.play();
  }
}