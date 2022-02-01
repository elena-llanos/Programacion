package conexionBD;

import java.sql.Connection;  
import java.sql.SQLException;  
import java.sql.DriverManager;  
import java.sql.Statement;  
import java.sql.ResultSet;  


public class BDconexion {
	
	// nuestro metodo para conectar

		public static Connection abrirConexion() {
			try {
				// la clase que se encuentra destro de nuestra libreria jar al ser via web
				// necesita esta clase
				Class.forName("com.mysql.cj.jdbc.Driver");
				// escribimos la cadena de conexion de la base de datos mysql tiene el propia
				// especificar todos estos parametros para podernos conectar correctamente al
				// mysql
				Connection conexion = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/biblioteca?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
						"biblio", "tuslibros");
			//	System.out.println("Conexion Establecida");
				return conexion;
			} catch (ClassNotFoundException e) {
				System.out.println("No se conect� a la Base de Datos");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("No se conect� a la Base de Datos");
				e.printStackTrace();
			}
			return null;
		}

		// nuestro metodo para desconectar

		public static void cerrarConexion(Connection conn, Statement instruccion, ResultSet resultado) {

			if (resultado != null) {
				try {
					resultado.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	//}
		
		
		
	}
		


