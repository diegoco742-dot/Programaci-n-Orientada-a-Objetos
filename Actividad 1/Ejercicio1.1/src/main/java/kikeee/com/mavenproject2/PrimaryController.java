package kikeee.com.mavenproject2;

import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblResultado;

    // Este método se ejecuta solo al abrir la ventana
    @FXML
    public void initialize() {
        // Cada vez que se escribe algo, se acomodan las diagonales
        txtFecha.textProperty().addListener((obs, viejo, nuevo) -> {
            String soloNumeros = nuevo.replaceAll("[^0-9]", "");

            if (soloNumeros.length() > 8) {
                soloNumeros = soloNumeros.substring(0, 8);
            }

            String formato = "";
            for (int i = 0; i < soloNumeros.length(); i++) {
                if (i == 2 || i == 4) {
                    formato = formato + "/";
                }
                formato = formato + soloNumeros.charAt(i);
            }

            if (!formato.equals(nuevo)) {
                txtFecha.setText(formato);
                txtFecha.positionCaret(formato.length());
            }
        });
    }

    @FXML
    void calcular(ActionEvent event) {
        String fecha = txtFecha.getText();
        String[] partes = fecha.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        LocalDate hoy = LocalDate.now();

        int anios = hoy.getYear() - anio;
        int meses = hoy.getMonthValue() - mes;

        // Si todavía no llega el día del mes, falta un mes completo
        if (hoy.getDayOfMonth() < dia) {
            meses = meses - 1;
        }

        // Si los meses quedan negativos, aún no cumple años este año
        if (meses < 0) {
            anios = anios - 1;
            meses = meses + 12;
        }

        lblResultado.setText("Tiene " + anios + " años con " + meses + " meses");
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtFecha.setText("");
        lblResultado.setText("");
    }
}