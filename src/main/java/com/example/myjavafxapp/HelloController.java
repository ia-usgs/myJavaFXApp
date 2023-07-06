package com.example.myjavafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Scanner;

public class HelloController {

    @FXML
    private Label BMIMessageLabel;

    @FXML
    private Label BMIMessageLabel2;

    //main button
    @FXML
    private Label BMICalcLabel;

    @FXML
    protected void onHelloButtonClick() {
        BMICalcLabel.setText("testing" ); // Change to do the math between label 1 and 2
    }
}

