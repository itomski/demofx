module de.lubowiecki.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.lubowiecki.demofx to javafx.fxml;
    exports de.lubowiecki.demofx;
}