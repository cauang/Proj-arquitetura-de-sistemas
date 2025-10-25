// Teste3.java  -> Log + Zip + Buffer sobre TCP, via fábrica
public class Teste3 {
    public static void main(String[] args) {
        Channel ch = ChannelFactory.build("tcp", true, true, true);
        ch.send("mensagem X");
        ch.receive();
    }
}
