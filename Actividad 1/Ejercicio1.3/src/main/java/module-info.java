module kikeee.com.ejercicio13 {
    requires javafx.controls;
    requires javafx.fxml;

    opens kikeee.com.ejercicio13 to javafx.fxml;
    exports kikeee.com.ejercicio13;
}