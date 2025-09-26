package Questao1;

public class Contrato implements Remuneravel {
    private float salario;

    public Contrato(float salario) {
        this.salario = salario;
    }

    public float salario() {
        return this.salario;
    }

    @Override
    public float remuneracao() {
        return salario();
    }
}

