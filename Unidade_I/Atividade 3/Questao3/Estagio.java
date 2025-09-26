package Questao3;


public class Estagio implements Remuneravel {
    private float bolsa;

    public Estagio(float bolsa) {
        this.bolsa = bolsa;
    }

    public float bolsa() {
        return this.bolsa;
    }

    @Override
    public float remuneracao() {
        return bolsa();
    }
}

