module kikeee.com.ejercicio15 {
    requires javafx.controls;
    requires javafx.fxml;

    opens kikeee.com.ejercicio15 to javafx.fxml;
    exports kikeee.com.ejercicio15;
}