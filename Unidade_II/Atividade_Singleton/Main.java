public class Main {
    public static void main(String[] args) {
        DBConn db1 = DBConn.getInstancia();
        DBConn db2 = DBConn.getInstancia();

        db1.connecta();


        System.out.println(db1 == db2);
    }
}
