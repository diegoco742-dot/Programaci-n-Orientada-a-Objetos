module kikeee.com.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens kikeee.com.mavenproject2 to javafx.fxml;
    exports kikeee.com.mavenproject2;
}