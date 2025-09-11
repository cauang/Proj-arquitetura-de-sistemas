package src;

public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato(3000f);
        Estagio estagio = new Estagio(1200f);

        Folha folha1 = new Folha();
        folha1.calcular(contrato);
        System.out.println("Saldo (Contrato): " + folha1.getSaldo());

        Folha folha2 = new Folha();
        folha2.calcular(estagio);
        System.out.println("Saldo (Estágio): " + folha2.getSaldo());
    }
}
