// LogChannel.java
public class LogChannel extends ChannelDecorator {
    public LogChannel(Channel inner) {
        super(inner);
    }

    @Override
    public void send(String data) {
        System.out.println("[LOG] antes de enviar");
        super.send(data);
        System.out.println("[LOG] depois de enviar");
    }

    @Override
    public String receive() {
        System.out.println("[LOG] antes de receber");
        String out = super.receive();
        System.out.println("[LOG] depois de receber");
        return out;
    }
}
