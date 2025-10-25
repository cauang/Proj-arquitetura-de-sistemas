public class OracleConnection implements DatabaseConnection {
    @Override
    public String getType() {
        return "Oracle";
    }

    @Override
    public void connect() {
        System.out.println("Conectando ao banco Oracle...");
    }
}
