module kikeee.com.ejercicio31 {
    requires javafx.controls;
    requires javafx.fxml;

    opens kikeee.com.ejercicio31 to javafx.fxml;
    exports kikeee.com.ejercicio31;
}