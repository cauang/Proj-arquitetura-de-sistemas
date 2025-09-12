package Atividade4.Pratica;

public class Circulo implements Forma {
    private final double raio;

    public Circulo(double raio) {
        if (raio <= 0) throw new IllegalArgumentException("Raio > 0");
        this.raio = raio;
    }

    public double getRaio() { return raio; }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
