// UDPChannel.java
public class UDPChannel implements Channel {
    @Override
    public void send(String data) {
        System.out.println("[UDP] enviando: " + data);
    }

    @Override
    public String receive() {
        String msg = "[UDP] recebendo dados";
        System.out.println(msg);
        return msg;
    }
}
