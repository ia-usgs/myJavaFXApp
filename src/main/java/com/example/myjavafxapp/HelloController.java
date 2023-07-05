package com.example.myjavafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label BMICalcLabel;

    @FXML
    protected void onHelloButtonClick() {
        BMICalcLabel.setText("Welcome to JavaFX Application!");
    }
    @FXML
    private Label BMIMessageLabel;

    @FXML
    private Label BMIMessageLabel2;
}