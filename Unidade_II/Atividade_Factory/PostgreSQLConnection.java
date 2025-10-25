public class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public String getType() {
        return "PostgreSQL";
    }

    @Override
    public void connect() {
        System.out.println("Conectando ao banco PostgreSQL...");
    }
}
