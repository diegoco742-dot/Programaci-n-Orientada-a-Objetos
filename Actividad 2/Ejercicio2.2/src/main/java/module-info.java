module kikeee.com.ejercicio22 {
    requires javafx.controls;
    requires javafx.fxml;

    opens kikeee.com.ejercicio22 to javafx.fxml;
    exports kikeee.com.ejercicio22;
}