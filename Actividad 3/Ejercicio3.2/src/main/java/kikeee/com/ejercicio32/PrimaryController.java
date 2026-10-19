package kikeee.com.ejercicio32;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML
    private Button btnIniciar;

    @FXML
    private Label lblLiebre;

    @FXML
    private Label lblTortuga;

    @FXML
    private ProgressBar barLiebre;

    @FXML
    private ProgressBar barTortuga;

    // Cuenta cuántos corredores ya terminaron
    private int terminados = 0;

    @FXML
    void iniciar(ActionEvent event) {
        btnIniciar.setDisable(true);
        terminados = 0;
        barLiebre.setProgress(0);
        barTortuga.setProgress(0);
        lblLiebre.setText("La Liebre: ¡Está corriendo!");
        lblTortuga.setText("La Tortuga: ¡Está corriendo!");

        // Hilo de la liebre: rápida, pero se duerme a la mitad
        Thread hiloLiebre = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(30);

                    // Al llegar al 60% se duerme
                    if (i == 60) {
                        Platform.runLater(() -> lblLiebre.setText("La Liebre: ¡Se durmió!"));
                        Thread.sleep(9000);
                        Platform.runLater(() -> lblLiebre.setText("La Liebre: ¡Despertó!"));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                final double progreso = i / 100.0;
                Platform.runLater(() -> barLiebre.setProgress(progreso));
            }

            Platform.runLater(() -> {
                lblLiebre.setText("La Liebre: ¡Llegó a la meta!");
                terminar();
            });
        });

        // Hilo de la tortuga: lenta pero constante
        Thread hiloTortuga = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                final double progreso = i / 100.0;
                Platform.runLater(() -> barTortuga.setProgress(progreso));
            }

            Platform.runLater(() -> {
                lblTortuga.setText("La Tortuga: ¡Llegó a la meta!");
                terminar();
            });
        });

        hiloLiebre.setDaemon(true);
        hiloTortuga.setDaemon(true);
        hiloLiebre.start();
        hiloTortuga.start();
    }

    // Cuando terminan los dos, se habilita otra vez el botón
    private void terminar() {
        terminados = terminados + 1;
        if (terminados == 2) {
            btnIniciar.setDisable(false);
        }
    }
}