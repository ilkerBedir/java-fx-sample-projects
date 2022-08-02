package com.example.demo7;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
  @FXML
  private AnchorPane myPane;
  @FXML
  private CheckBox checkBoxId;
  @FXML
  private Label checkBoxLabel;

  @FXML
  private ColorPicker colorPickerID;

  @FXML
  private DatePicker datePickerID;
  @FXML
  private Label dateLabel;

  @FXML
  private Label radioButtonLabel;
  @FXML private RadioButton pizzaId,sushiId;

  @FXML
  private ChoiceBox<String> comboID;
  @FXML
  private Label comboLabel;
  private String[] food={"pizza","sushi","ramen"};

  @FXML
  private Slider sliderId;
  @FXML
  private Label sliderLabel;

  @FXML
  private ProgressBar progresBarID;
  @FXML
  private Button progresButton;
  double progress;

  @FXML
  private Spinner<Integer> mySpinner;
  @FXML
  private Label spinnerLabel;
  int currentValue;

  @FXML
  private ListView<String> myListView;

  @FXML
  private Label listViewLabel;

  public void checkBoxEvent(ActionEvent event){
    if (checkBoxId.isSelected()){
      checkBoxLabel.setText("ON");
    }else{
      checkBoxLabel.setText("OFF");
    }
  }
  public void datePickerEvent(ActionEvent event){
    LocalDate value = datePickerID.getValue();
    dateLabel.setText(value.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy")));
  }

  public void colorPickerEvent(ActionEvent event){
    Color color = colorPickerID.getValue();
    myPane.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    comboID.getItems().addAll(food);
    comboID.setOnAction(this::getFood);
    sliderId.valueProperty().addListener((observable, oldValue, newValue) ->
      sliderLabel.setText(String.valueOf(((int) sliderId.getValue()))));
    progresBarID.setStyle("-fx-accent: #00FF00;");
    progress=progresBarID.getProgress();
    SpinnerValueFactory<Integer> valueFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
    valueFactory.setValue(1);
    mySpinner.setValueFactory(valueFactory);
    currentValue=mySpinner.getValue();
    spinnerLabel.setText(Integer.toString(currentValue));
    mySpinner.valueProperty().addListener((observable, oldValue, newValue) -> {
      currentValue=mySpinner.getValue();
      spinnerLabel.setText(Integer.toString(currentValue));
    });
    myListView.getItems().addAll(food);
    myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
      @Override
      public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        listViewLabel.setText(myListView.getSelectionModel().getSelectedItem());
      }
    });
  }

  public void getFood(ActionEvent event){
    String value = ( comboID.getValue());
    comboLabel.setText(value);
  }

  public void radioButtonEvent(ActionEvent event){
    if (pizzaId.isSelected()){
      radioButtonLabel.setText(pizzaId.getText());
    }else if (sushiId.isSelected()){
      radioButtonLabel.setText(sushiId.getText());
    }
  }
  public void increaseBar(ActionEvent event){
    progress+=0.1;
    progresBarID.setProgress(progress);
  }
  public void saveMenuBar(ActionEvent event){
    System.out.println("Saved");
  }
}