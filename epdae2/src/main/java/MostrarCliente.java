import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MostrarCliente {
    public static void main(String[] args) throws Exception {
        MysqlConnection mysqlConnection = new MysqlConnection();
        Connection connection = mysqlConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM cliente" );

        while (rs.next()){
            System.out.println("El resultado del qeuery es:"+rs.getString(2)+" "+rs.getString(3)+" "
                    +rs.getString(4)+" "
                    +rs.getString(5));
        }

    }
}
