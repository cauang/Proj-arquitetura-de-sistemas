// Main.java  -> demonstra todos
public class Main {
    public static void main(String[] args) {
        Channel tcp      = new TCPChannel();
        Channel udp      = new UDPChannel();
        Channel logged   = new LogChannel(tcp);
        Channel zipped   = new ZipChannel(udp);
        Channel fullPipe = new LogChannel(new ZipChannel(new BufferChannel(new TCPChannel())));

        System.out.println("=== TCP puro ===");
        tcp.send("A");
        tcp.receive();

        System.out.println("\n=== UDP puro ===");
        udp.send("B");
        udp.receive();

        System.out.println("\n=== Log sobre TCP ===");
        logged.send("C");
        logged.receive();

        System.out.println("\n=== Zip sobre UDP ===");
        zipped.send("D");
        zipped.receive();

        System.out.println("\n=== Log + Zip + Buffer sobre TCP ===");
        fullPipe.send("E");
        fullPipe.receive();
    }
}
