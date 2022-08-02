package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
  @FXML
  private Circle myCircle;
  private double x;
  private double y;

  public void up(ActionEvent e){
    myCircle.setCenterY(y-=10);
//    System.out.println("UP");
  }
  public void left(ActionEvent e){
    myCircle.setCenterX(x-=10);

//    System.out.println("LEFT");
  }
  public void right(ActionEvent e){
//    System.out.println("RIGHT");
    myCircle.setCenterX(x+=10);
  }
  public void down(ActionEvent e){
    myCircle.setCenterY(y+=10);

//    System.out.println("DOWN");
  }


}