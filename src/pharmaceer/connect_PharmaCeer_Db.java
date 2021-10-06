
package pharmaceer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connect_PharmaCeer_Db {
    public static Connection connect(){
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmaceer?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        return conn;
    }
}
