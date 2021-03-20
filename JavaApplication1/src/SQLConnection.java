 import java.sql.Connection;
 import java.sql.DriverManager;
         
/**
 *
 * @author Jacob
 */
public class SQLConnection {
    public static Connection getconnection(){
        Connection con= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("http://ec2-3-17-178-208.us-east-2.compute.amazonaws.com/phpMyAdmin/index.php?route=/database/structure&server=1&db=Users", "root", "toor");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
