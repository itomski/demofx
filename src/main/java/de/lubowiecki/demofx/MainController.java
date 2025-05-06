package de.lubowiecki.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

    /* Aufgabe 1:
    Baue ein Formular zum Speichern von Personendaten
    Es soll ein Vorname, Nachname und Alter entgegengenommen werden
    und in ein Textarea ausgegeben werden
    Anschließend sollen die Eigabefelder geleert werden
     */

    /* Aufgabe 2:
    Erweitere das Programm so, dass die Eingaben aus dem Formular
    nicht als Text in einem StringBuilder festgehalten werden, sondern
    als Personen-Objekten in einer Liste.
    Das Personen-Objekt soll neben dem Alter als int auch
    ein Datum enthalten zu dem das Objekt hinzugefügt wurde.
    Das Datum wird automatisch erzeugt und ist erst in der Ausgabe sichtbar.
     */


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