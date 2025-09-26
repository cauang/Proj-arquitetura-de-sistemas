package Atividade4.Pratica;

public class Quadrado implements Forma {
    private final double lado;

    public Quadrado(double lado) {
        if (lado <= 0) throw new IllegalArgumentException("Lado > 0");
        this.lado = lado;
    }

    public double getLado() { return lado; }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}