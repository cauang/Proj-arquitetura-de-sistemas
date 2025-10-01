package Projeto;

public class TCPChannel implements Channel {
    @Override
    public void getMessage() {
        System.out.println("Envia mensagem TCP");
    }
}
