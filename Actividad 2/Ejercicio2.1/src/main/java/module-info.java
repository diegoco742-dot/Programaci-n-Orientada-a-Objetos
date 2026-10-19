module kikeee.com.ejercicio21 {
    requires javafx.controls;
    requires javafx.fxml;

    opens kikeee.com.ejercicio21 to javafx.fxml;
    exports kikeee.com.ejercicio21;
}