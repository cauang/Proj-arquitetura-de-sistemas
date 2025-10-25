// Teste2.java  -> Zip + Buffer sobre UDP
public class Teste2 {
    public static void main(String[] args) {
        Channel ch = new ZipChannel(new BufferChannel(new UDPChannel()));
        ch.send("dados importantes");
        ch.receive();
    }
}
