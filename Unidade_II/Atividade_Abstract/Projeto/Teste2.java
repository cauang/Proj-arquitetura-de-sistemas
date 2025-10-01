package Projeto;

public class Teste2 {
    private final Channel ch;

    public Teste2() {
        this.ch = ChannelFactory.create(ChannelType.TCP);
    }

    public void getMessage() {
        this.ch.getMessage();
    }
}

