package de.lubowiecki.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label welcomeText;

    @FXML // Macht die Variable als id in der View verfügbar
    private Label text2;

    @FXML
    private TextField input;

    @FXML
    private TextArea output;

    private StringBuilder content = new StringBuilder();

    @FXML
    protected void onButtonClick1() {
        // Text aus dem TextFeld einlesen und ihn in einen StringBuilder ablegen
        content.append(input.getText()).append("\n");

        // Inhalt des StringBuilders in das TextArea ausgeben
        output.setText(content.toString());

        // Eingabefeld leeren
        input.clear();
    }

    @FXML // Macht die Methode in der View verfügbar
    protected void onButtonClick2() {
        welcomeText.setText("Hallo 2");
    }

    @FXML
    protected void onButtonClick3() {
        text2.setText("Hallo 3");
    }
}