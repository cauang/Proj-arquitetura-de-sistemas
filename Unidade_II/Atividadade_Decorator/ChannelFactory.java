// ChannelFactory.java
import java.util.Locale;

public class ChannelFactory {

    public static Channel base(String type) {
        switch (type.toLowerCase(Locale.ROOT)) {
            case "tcp": return new TCPChannel();
            case "udp": return new UDPChannel();
            default: throw new IllegalArgumentException("Canal base inválido: " + type);
        }
    }

    public static Channel withLog(Channel c)    { return new LogChannel(c); }
    public static Channel withZip(Channel c)    { return new ZipChannel(c); }
    public static Channel withBuffer(Channel c) { return new BufferChannel(c); }

    // Ex.: build("tcp", true,true,false) -> Log+Zip sobre TCP
    public static Channel build(String baseType, boolean log, boolean zip, boolean buffer) {
        Channel c = base(baseType);
        if (buffer) c = new BufferChannel(c);
        if (zip)    c = new ZipChannel(c);
        if (log)    c = new LogChannel(c);
        return c;
    }
}
