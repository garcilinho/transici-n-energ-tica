/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConfigBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSql {
/*
    private final String url = "jdbc:postgresql://localhost:5432/transicionEnergeticaJusta";
    private final String usuario = "postgres"; // Corrige el nombre del usuario a "postgres" si estaba mal escrito.
    private final String contrasenia = "123456789";
*/

    private final String supabase = "jdbc:postgresql://aws-0-us-west-1.pooler.supabase.com:6543/postgres?user=postgres.wxeeevahbycdkcqoyiyp&password=Code_Leran2024";

    // Metodo para establecer la conexión
    public Connection conectar() {
        Connection conn = null;
        try {
            // Cargamos el driver de PostgreSQL
            Class.forName("org.postgresql.Driver");
            // Establecemos la conexión
            //conn = DriverManager.getConnection(url, usuario, contrasenia);
             conn = DriverManager.getConnection(supabase);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encuentra el driver de PostgreSQL");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
        }
        return conn; // Retornamos el objeto Connection
    }

    //Metodo para cerrar la conexión
    public void cerrarConexion(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

}
