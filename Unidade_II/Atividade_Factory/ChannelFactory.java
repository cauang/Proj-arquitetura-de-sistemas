public class ChannelFactory {
    public static Channel create() {
        return new UDPChannel();
    }

    // public static Channel createUDPChannel() {
    //     return new UDPChannel();
    // }

}
