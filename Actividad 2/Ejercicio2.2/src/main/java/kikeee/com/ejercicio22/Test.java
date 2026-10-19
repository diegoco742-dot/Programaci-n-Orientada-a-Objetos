package kikeee.com.ejercicio22;

public class Test {

    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3, 4);
        System.out.println(f.imprimeFigura());
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}