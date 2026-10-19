module kikeee.com.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens kikeee.com.mavenproject3 to javafx.fxml;
    exports kikeee.com.mavenproject3;
}