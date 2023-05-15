

import java.sql.*;



public class MysqlConnection {


    public MysqlConnection(){
    }
    public Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/Floreria","root","root");
    }

}
