package com.example.myjavafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class HelloController {

    @FXML
    private TextField BMITextfield1; //textfield

    @FXML
    private TextField BMITextfield2; //textfield

    //main button
    @FXML
    private Label BMIMessageLabel;

    @FXML
    private Label BMIMessageLabel2;

    @FXML
    protected void onHelloButtonClick() {
        BMIMessageLabel.setText("testing" ); // Change to do the math between label 1 and 2
    }
}

