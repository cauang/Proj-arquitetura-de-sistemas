public interface Channel {
    void send(String data);
    String receive();
}
