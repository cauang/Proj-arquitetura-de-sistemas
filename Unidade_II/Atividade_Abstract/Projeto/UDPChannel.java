package Projeto;

public class UDPChannel implements Channel {
    @Override
    public void getMessage() {
        System.out.println("Envia mensagem UDP");
    }
}
