// ChannelDecorator.java
public abstract class ChannelDecorator implements Channel {
    protected final Channel inner;

    protected ChannelDecorator(Channel inner) {
        this.inner = inner;
    }

    @Override
    public void send(String data) {
        inner.send(data);
    }

    @Override
    public String receive() {
        return inner.receive();
    }
}
