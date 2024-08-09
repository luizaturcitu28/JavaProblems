package org.example.simple_calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SimpleCalculatorApp extends Application {
    @Override
    public void start(Stage primaryStage)  {
        primaryStage.setTitle("Simple Calculator");

        TextField number1 = new TextField();
        TextField number2 = new TextField();
        Label resultLabel = new Label("Result: ");
        Button addButton = new Button("+");
        Button substractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");

        addButton.setOnAction(e -> calculate(number1, number2, resultLabel, "+"));
        substractButton.setOnAction(e -> calculate(number1, number2, resultLabel, "-"));
        multiplyButton.setOnAction(e -> calculate(number1, number2, resultLabel, "*"));
        divideButton.setOnAction(e -> calculate(number1, number2, resultLabel, "/"));

        HBox buttons = new HBox(addButton, substractButton, multiplyButton, divideButton);
        buttons.setSpacing(10);

        VBox vbox = new VBox(number1, number2, buttons, resultLabel);
        vbox.setSpacing(10);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate(TextField number1, TextField number2, Label resultLabel, String operation) {
        try {
            double num1 = Double.parseDouble(number1.getText());
            double num2 = Double.parseDouble(number2.getText());
            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultLabel.setText("Eroare: Impartirea la zero nu este permisa!");
                        return;
                    }
                    break;
            }

            resultLabel.setText("Rezultat: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Eroare: Introduceti numere valide!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}