package formas;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }
}
