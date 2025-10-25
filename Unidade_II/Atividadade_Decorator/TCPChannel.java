// TCPChannel.java
public class TCPChannel implements Channel {
    @Override
    public void send(String data) {
        System.out.println("[TCP] enviando: " + data);
    }

    @Override
    public String receive() {
        String msg = "[TCP] recebendo dados";
        System.out.println(msg);
        return msg;
    }
}
