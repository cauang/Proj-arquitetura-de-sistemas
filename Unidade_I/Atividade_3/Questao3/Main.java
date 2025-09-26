package Questao3;

public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato(3000f);
        Estagio estagio = new Estagio(1200f);
        CLT clt = new CLT(2500f, 500f);

        Folha folha1 = new Folha();
        folha1.calcular(contrato);
        System.out.println("Saldo (Contrato): " + folha1.getSaldo());

        Folha folha2 = new Folha();
        folha2.calcular(estagio);
        System.out.println("Saldo (Estágio): " + folha2.getSaldo());

        Folha folha3 = new Folha();
        folha3.calcular(clt);
        System.out.println("Saldo (CLT): " + folha3.getSaldo());
    }
}