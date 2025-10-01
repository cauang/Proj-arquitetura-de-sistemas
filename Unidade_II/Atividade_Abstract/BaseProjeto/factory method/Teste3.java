public class Teste3 {
    private Channel ch;
    public Teste3(){
        ch = ChannelFactory.create();
    }
        public void getMessage(){
        this.ch.getMessage();
    }
}
