package Projeto;
    
public class Teste1 {
    private final Channel ch;

    public Teste1() {
        this.ch = ChannelFactory.create(ChannelType.UDP);
    }

    public void getMessage() {
        this.ch.getMessage();
    }
}
