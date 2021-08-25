package pessoa.carlospavao.DIO.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {
        String urlConnection = "jdbc://localhost/digital_Innovation";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(urlConnection, "root", "C@r0laine2810P@va0*$");
            System.out.println("Sucesso");
        }catch (Exception e ){
            System.out.println("Falhar");
        }finally {
            conn.close();
        }


    }
}
