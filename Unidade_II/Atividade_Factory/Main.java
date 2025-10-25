import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            
        Teste1 t1 = new Teste1();
        Teste2 t2 = new Teste2();
        Teste3 t3 = new Teste3();

        t1.getMessage();
        t2.getMessage();
        t3.getMessage();

        DatabaseConnection oracle = ConnectionFactory.create(ConnectionFactory.DbType.ORACLE);
        DatabaseConnection postgres = ConnectionFactory.create(ConnectionFactory.DbType.POSTGRESQL);
        DatabaseConnection mysql = ConnectionFactory.create(ConnectionFactory.DbType.MYSQL);

        List<DatabaseConnection> connections = Arrays.asList(oracle, postgres, mysql);

        for (DatabaseConnection conn : connections) {
            conn.connect();
            System.out.println("Tipo de conexão: " + conn.getType());
            System.out.println("--------------------------");
        }
    }
}