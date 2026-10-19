module kikeee.com.ejercicio12 {
    requires javafx.controls;
    requires javafx.fxml;

    opens kikeee.com.ejercicio12 to javafx.fxml;
    exports kikeee.com.ejercicio12;
}