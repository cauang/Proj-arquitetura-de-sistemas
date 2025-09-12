package Atividade4.Pratica;

public class Retangulo implements Forma {
    private final double base;
    private final double altura;

    public Retangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) throw new IllegalArgumentException("Dimensões > 0");
        this.base = base;
        this.altura = altura;
    }

    public double getBase()   { return base; }
    public double getAltura() { return altura; }

    @Override
    public double calculaArea() {
        return base * altura;
    }
}
