// BufferChannel.java
public class BufferChannel extends ChannelDecorator {
    public BufferChannel(Channel inner) {
        super(inner);
    }

    @Override
    public void send(String data) {
        String buffered = "[buffer]{" + data + "}";
        System.out.println("[BUFFER] agregando em buffer");
        super.send(buffered);
    }

    @Override
    public String receive() {
        String out = super.receive();
        System.out.println("[BUFFER] liberando do buffer");
        return out;
    }
}
