package Projeto;

public class ChannelFactory {

    public static Channel create() {
        return new UDPChannel();
    }

    // Escolha explícita do tipo
    public static Channel create(ChannelType type) {
        switch (type) {
            case TCP:
                return new TCPChannel();
            case UDP:
            default:
                return new UDPChannel();
        }
    }
}
