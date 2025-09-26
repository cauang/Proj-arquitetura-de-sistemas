package Questao3;


public class CLT implements Remuneravel {
    private float salarioBase;
    private float beneficios;

    public CLT(float salarioBase, float beneficios) {
        this.salarioBase = salarioBase;
        this.beneficios = beneficios;
    }

    public float salarioBase() {
        return this.salarioBase;
    }

    public float beneficios() {
        return this.beneficios;
    }

    @Override
    public float remuneracao() {
        return salarioBase + beneficios;
    }
}

