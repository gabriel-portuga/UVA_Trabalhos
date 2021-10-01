package connection;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/mysql";
    private static String USER = "root";
    private static String PASS = "S@7p89C1";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
        
    }
    public static void closeConnection(Connection com){
            try {
                if(com != null){
                com.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
                   
    }
        public static void closeConnection(Connection com, PreparedStatement stmt){
            closeConnection(com);
            
            try {
                if(stmt != null){
                stmt.close();
                }
            }catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        public static void closeConnection(Connection com, PreparedStatement stmt, ResultSet rs){
            closeConnection(com, stmt);
            
            try {
                if(rs != null){
                rs.close();
                }
            }catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
}
