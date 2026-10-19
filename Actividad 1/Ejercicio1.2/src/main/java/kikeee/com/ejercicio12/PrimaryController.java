package kikeee.com.ejercicio12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;

    @FXML
    private Label lblResultado;

    @FXML
    void desglosar(ActionEvent event) {
        int dinero = Integer.parseInt(txtDinero.getText());

        int b500 = dinero / 500;
        dinero = dinero % 500;

        int b200 = dinero / 200;
        dinero = dinero % 200;

        int b100 = dinero / 100;
        dinero = dinero % 100;

        int b50 = dinero / 50;
        dinero = dinero % 50;

        int b20 = dinero / 20;
        dinero = dinero % 20;

        int m10 = dinero / 10;
        dinero = dinero % 10;

        int m5 = dinero / 5;
        dinero = dinero % 5;

        int m2 = dinero / 2;
        dinero = dinero % 2;

        int m1 = dinero;

        lblResultado.setText(b500 + "\n" + b200 + "\n" + b100 + "\n" + b50 + "\n"
                + b20 + "\n" + m10 + "\n" + m5 + "\n" + m2 + "\n" + m1);
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtDinero.setText("");
        lblResultado.setText("");
    }
}