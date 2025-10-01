public class Teste2 {
    private Channel ch;
    public Teste2(){
        ch = ChannelFactory.create();
    }
        public void getMessage(){
        this.ch.getMessage();
    }
}
