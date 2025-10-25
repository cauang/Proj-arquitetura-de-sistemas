public class ConnectionFactory {

    public enum DbType { ORACLE, POSTGRESQL, MYSQL }

    public static DatabaseConnection create(DbType type) {
        switch (type) {
            case ORACLE:
                return new OracleConnection();
            case POSTGRESQL:
                return new PostgreSQLConnection();
            case MYSQL:
                return new MySQLConnection();
            default:
                throw new IllegalArgumentException("Tipo de DB não suportado: " + type);
        }
    }
}