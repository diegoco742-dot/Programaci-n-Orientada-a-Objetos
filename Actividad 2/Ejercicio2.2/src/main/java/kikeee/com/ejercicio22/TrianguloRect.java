package kikeee.com.ejercicio22;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(ancho * ancho + alto * alto);
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        System.out.println("Se imprime una FiguraPlana...");
        return "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho
                + ", area: " + String.format("%.2f", calcularArea())
                + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}