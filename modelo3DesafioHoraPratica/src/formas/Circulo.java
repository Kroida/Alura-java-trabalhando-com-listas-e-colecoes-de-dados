package formas;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }
}
