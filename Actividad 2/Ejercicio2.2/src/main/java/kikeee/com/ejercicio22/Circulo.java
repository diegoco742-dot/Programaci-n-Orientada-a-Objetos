package kikeee.com.ejercicio22;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimeFigura() {
        System.out.println("Se imprime una FiguraPlana...");
        return "Se imprime un Circulo con radio: " + radio
                + ", area: " + String.format("%.2f", calcularArea())
                + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}