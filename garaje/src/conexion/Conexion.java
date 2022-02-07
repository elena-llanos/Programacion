package conexion;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.mysql.jdbc.Statement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	// nuestro metodo para conectar

	public static Connection abrirConexion() {
		try {
			// la clase que se encuentra destro de nuestra libreria jar al ser via web
			// necesita esta clase
			Class.forName("com.mysql.jdbc.Driver");
			// escribimos la cadena de conexion de la base de datos mysql tiene el propia
			// especificar todos estos parametros para podernos conectar correctamente al
			// mysql
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/garaje", "root", "");
			
			return conexion;
			
		} catch (ClassNotFoundException e) {
			System.out.println("No se conecto a la BD");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("No se conecto a la BD");
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

}