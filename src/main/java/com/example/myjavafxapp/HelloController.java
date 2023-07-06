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
        float a=Float.parseFloat(BMITextfield1.getText());
        float b=Float.parseFloat(BMITextfield2.getText());
        float bmi=b/(a*a);
        BMIMessageLabel.setText("" + bmi);

        if (bmi <= 18) {
            BMIMessageLabel2.setText(" You are Seriously Underweight");
        } else if (bmi <= 18.5) {
            BMIMessageLabel2.setText("You are Underweight");
        } else if (bmi <= 24.9) {
            BMIMessageLabel2.setText("Normal Weight");
        } else if (bmi <= 29.9) {
            BMIMessageLabel2.setText("You are Overweight");
        } else {
            BMIMessageLabel2.setText("You are Obese");
        }

    }
}

