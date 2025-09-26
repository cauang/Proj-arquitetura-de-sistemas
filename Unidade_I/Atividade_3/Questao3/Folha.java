package Questao3;

public class Folha {
    private float saldo;

    public void calcular(Remuneravel r) {
        this.saldo = r.remuneracao();
    }

    public float getSaldo() {
        return saldo;
    }
}
