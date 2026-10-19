package kikeee.com.ejercicio31;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtClics;

    @FXML
    private ProgressBar barra;

    @FXML
    private Button btnEsperar;

    private int contador = 0;

    @FXML
    void contar(ActionEvent event) {
        contador = contador + 1;
        txtClics.setText("" + contador);
    }

    @FXML
    void esperar(ActionEvent event) {
        // Se deshabilita el botón al iniciar
        btnEsperar.setDisable(true);
        barra.setProgress(0);

        // El hilo hace la espera para que la ventana no se congele
        Thread hilo = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                final double progreso = i / 100.0;

                // Los cambios a la ventana se hacen con Platform.runLater
                Platform.runLater(() -> barra.setProgress(progreso));
            }

            // Se habilita el botón al terminar
            Platform.runLater(() -> btnEsperar.setDisable(false));
        });

        hilo.setDaemon(true);
        hilo.start();
    }
}