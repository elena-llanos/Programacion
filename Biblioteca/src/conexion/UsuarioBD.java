package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import conexionBD.BDconexion;

import misclases.Usuario;

public class UsuarioBD extends BDconexion {
	
	
		public static boolean anadirUsuario(Usuario usuario) {
			
			Connection conn = abrirConexion();
			
			Statement instruccion = null;

			try {
				
				instruccion = conn.createStatement();
				instruccion.executeUpdate("INSERT INTO usuarios(dni_usuario, nombre_usuario, apellido_usuario) VALUES('" 
						+ usuario.getDni() + "','" + usuario.getNombre() + "','" + usuario.getApellido() +  "')");
				return true;
			}
				catch (SQLIntegrityConstraintViolationException s) {
					System.out.println("\t\r Usuario registrado, elige la Opción 2 para comprar tu billete.");
					return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			} finally {
				cerrarConexion(conn, instruccion, null);
			}

		}

		
		}
		
