// Teste1.java  -> Log sobre TCP
public class Teste1 {
    public static void main(String[] args) {
        Channel ch = new LogChannel(new TCPChannel());
        ch.send("hello");
        ch.receive();
    }
}
