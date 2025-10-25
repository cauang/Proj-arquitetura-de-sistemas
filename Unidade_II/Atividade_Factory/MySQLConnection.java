public class MySQLConnection implements DatabaseConnection {
    @Override
    public String getType() {
        return "MySQL";
    }

    @Override
    public void connect() {
        System.out.println("Conectando ao banco MySQL...");
    }
}
