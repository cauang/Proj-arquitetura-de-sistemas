package Projeto;

public class Teste3 {
    private final Channel ch;

    public Teste3() {
        this.ch = ChannelFactory.create(ChannelType.UDP);
    }

    public void getMessage() {
        this.ch.getMessage();
    }
}