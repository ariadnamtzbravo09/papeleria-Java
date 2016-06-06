
package papeleria_completo;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class conectar 
{
        Connection conect = null;
    public Connection conexion()
    {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conect=DriverManager.getConnection("jdbc:mysql://localhost/papeleria","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
        return conect;
    }
    
}
