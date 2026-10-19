package kikeee.com.mavenproject3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextArea txtTabla;

    @FXML
    void calcular(ActionEvent event) {
        int numero = Integer.parseInt(txtNumero.getText());
        String tabla = "";

        for (int i = 1; i <= 10; i++) {
            tabla = tabla + numero + "x" + i + " = " + (numero * i) + "\n";
        }

        txtTabla.setText(tabla);
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtNumero.setText("");
        txtTabla.setText("");
    }
}