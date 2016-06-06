
package papeleria_completo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
/**
 *
 * @author Ariadna
 */
public class Usuario {
private String usuario;
private String contraseña;
private int cveTipo;
private String nombre;


public void Usuario(String strNomUsuario, String strPassword,
        int nCveTipo, String strNombre)
{
    this.usuario =strNomUsuario;
    this.contraseña=strPassword;
    this.cveTipo=nCveTipo;
    this.nombre=strNombre;  
}
public void setNomUsuario(String strNomUsuario)
{
    this.usuario=strNomUsuario;
}
public void setPassword(String strPassword)
{
    this.contraseña=strPassword;
}
public void setTipoUsuario(int nCveTipo){
    this.cveTipo=nCveTipo;
}

public void setNombre(String strNombre){
this.nombre=strNombre;
}
public String getNomUsuario(){
return usuario;
}
public String getPassword(){
return contraseña;
}
public int getTipoUsario(){
return cveTipo;
}
public String getNombre(){
return nombre;
}


public int ValidaUsuario(String strNomUsuario,
char[]strPasword){
    int tipoUsuario=0;
    
    try{
    File archivo=new File("Usuarios.txt");
    if(archivo.exists()){
        BufferedReader br=new BufferedReader(new FileReader("Usuarios.txt"));
        String linea;
        while((linea=br.readLine())!=null){
            StringTokenizer st=new StringTokenizer(linea,",");
            String usuario =st.nextToken().trim();
            String contraseña=st.nextToken().trim();
            char[] clave=contraseña.toCharArray();
            if((usuario.equals(strNomUsuario))&&
                    (Arrays.equals(clave,strPasword)))
            {
                tipoUsuario=Integer.parseInt(st.nextToken().trim());
                
            }
        }
    }
    else{
        JOptionPane.showMessageDialog(null, "EL archivo de usuario no existe");
    }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Se produjo un error"+e);
    }
    return tipoUsuario;
}   

    void SetVisble(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
