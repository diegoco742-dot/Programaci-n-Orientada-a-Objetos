package kikeee.com.ejercicio13;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtImpares;

    @FXML
    private TextField txtPares;

    @FXML
    private TextField txtTotal;

    @FXML
    private TextField txtMayor;

    @FXML
    private TextField txtMenor;

    @FXML
    private TextArea txtDivisores;

    @FXML
    void analizar(ActionEvent event) {
        int numero = Integer.parseInt(txtNumero.getText());
        int copia = numero;

        int cantidad = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int mayor = 0;
        int menor = 9;

        // Se separa cada cifra del número
        while (copia > 0) {
            int cifra = copia % 10;

            cantidad = cantidad + 1;

            if (cifra % 2 == 0) {
                sumaPares = sumaPares + cifra;
            } else {
                sumaImpares = sumaImpares + cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }

            if (cifra < menor) {
                menor = cifra;
            }

            copia = copia / 10;
        }

        int total = sumaPares + sumaImpares;

        // Se buscan los divisores del número
        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores = divisores + i + "\n";
            }
        }

        txtCantidad.setText("" + cantidad);
        txtImpares.setText("" + sumaImpares);
        txtPares.setText("" + sumaPares);
        txtTotal.setText("" + total);
        txtMayor.setText("" + mayor);
        txtMenor.setText("" + menor);
        txtDivisores.setText(divisores);
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtNumero.setText("");
        txtCantidad.setText("");
        txtImpares.setText("");
        txtPares.setText("");
        txtTotal.setText("");
        txtMayor.setText("");
        txtMenor.setText("");
        txtDivisores.setText("");
    }
}