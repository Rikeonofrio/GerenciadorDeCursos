package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectionjar {

    public Connection getConexao() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/projetojava", //linha de conexao
                    "root",     //usuario mysql
                    ""      //senha do mysql

            );
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
