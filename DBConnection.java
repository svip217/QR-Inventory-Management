
import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author muffler
 */
public class DBConnection {
    public static Connection getDBConnection(){
        Connection con;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qrinventory?useSSL=true","root","toor");
        
        
        return con;
        
        } catch (Exception ex) {
            return null;
        }
        
    }
    
}
    


