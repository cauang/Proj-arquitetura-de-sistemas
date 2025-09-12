package Atividade4.Pratica;

public class main {
    public static void main(String[] args) {
        Forma f1 = new Retangulo(5, 10);
        Forma f2 = new Quadrado(7);
        Forma f3 = new Circulo(3.5);

        System.out.printf("Área do Retângulo: %.2f%n", f1.calculaArea());
        System.out.printf("Área do Quadrado : %.2f%n", f2.calculaArea());
        System.out.printf("Área do Círculo  : %.2f%n", f3.calculaArea());
    }
}
