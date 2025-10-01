public class Teste1 {
    private Channel ch;
    public Teste1(){
        ch = ChannelFactory.create();
    }

    public void getMessage(){
        this.ch.getMessage();
    }
}
