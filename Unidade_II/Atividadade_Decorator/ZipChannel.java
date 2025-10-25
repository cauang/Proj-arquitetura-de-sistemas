// ZipChannel.java
public class ZipChannel extends ChannelDecorator {
    public ZipChannel(Channel inner) {
        super(inner);
    }

    @Override
    public void send(String data) {
        String zipped = compress(data);
        System.out.println("[ZIP] comprimindo dados");
        super.send(zipped);
    }

    @Override
    public String receive() {
        String out = super.receive();
        System.out.println("[ZIP] descomprimindo dados");
        return out;
    }

    private String compress(String data) {
        // simulação simples de "compressão"
        return "ZIP(" + data + ")";
    }
}
