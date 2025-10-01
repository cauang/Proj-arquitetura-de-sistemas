public class DBConn {
    // 1. Instância única e estática
    private static DBConn instancia;

    // 2. Construtor privado para evitar instâncias externas
    private DBConn() {
        // inicialização se necessário
    }

    // 3. Método público para acessar a instância
    public static DBConn getInstancia() {
        if (instancia == null) {
            instancia = new DBConn();
        }
        return instancia;
    }

    // Método original
    public void connecta() {
        System.out.println("Conecta com o banco de dados!");
    }
}