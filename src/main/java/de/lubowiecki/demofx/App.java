package de.lubowiecki.demofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // Hier wird das FXML geladen und eine Objektstruktur daraus gebildet
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("main-view.fxml"));

        // Es wird eine Scene erzeugt
        Scene scene = new Scene(fxmlLoader.load());

//        Label lab = new Label("Dies und das!");
//        Button btn = new Button("Click");
//        VBox box = new VBox(lab, btn);
//        Scene scene = new Scene(box);

        stage.setTitle("DemoFx!");
        // Scene wird auf die Bühne gestellt
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}