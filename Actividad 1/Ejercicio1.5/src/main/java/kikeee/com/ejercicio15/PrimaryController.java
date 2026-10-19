package kikeee.com.ejercicio15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtAlimentacion;

    @FXML
    private TextField txtRefrigerios;

    @FXML
    private TextField txtTransporte;

    @FXML
    private TextField txtTelefonia;

    @FXML
    private TextField txtOtros;

    @FXML
    private TextField txtTotal;

    @FXML
    private TextField txtMasAlto;

    @FXML
    void calcular(ActionEvent event) {
        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefonia = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());

        int total = alimentacion + refrigerios + transporte + telefonia + otros;

        // Se busca el gasto más alto
        int mayor = alimentacion;
        String nombre = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            nombre = "Refrigerios";
        }

        if (transporte > mayor) {
            mayor = transporte;
            nombre = "Transporte";
        }

        if (telefonia > mayor) {
            mayor = telefonia;
            nombre = "Telefonía";
        }

        if (otros > mayor) {
            mayor = otros;
            nombre = "Otros";
        }

        txtTotal.setText("" + total);
        txtMasAlto.setText(nombre);
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotal.setText("");
        txtMasAlto.setText("");
    }
}