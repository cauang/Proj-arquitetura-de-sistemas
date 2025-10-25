package Unidade_II.Atividade_Padroes_Projetos_Criacionais.PrototypeProject;

public class Refrigerante implements Bebida {
    private String sabor;
    private boolean comGelo;
    private String tamanho;

    public Refrigerante(String sabor, boolean comGelo, String tamanho) {
        this.sabor = sabor;
        this.comGelo = comGelo;
        this.tamanho = tamanho;
    }

    @Override
    public Bebida clone() {
        return new Refrigerante(this.sabor, this.comGelo, this.tamanho);
    }

    @Override
    public String toString() {
        return "Refrigerante [Sabor=" + sabor +
               ", Gelo=" + comGelo +
               ", Tamanho=" + tamanho + "]";
    }
}
