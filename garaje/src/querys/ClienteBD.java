package querys;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.Conexion;
import controlador.EntradaDatos;
import modelo.Cliente;
import modelo.Vehiculo;
import vista.GestionGaraje;

public class ClienteBD extends Conexion {

	public static boolean insertarCliente(Cliente cliente) {

		Connection conn = abrirConexion();

		Statement instruccion = null;

		try {

			instruccion = conn.createStatement();

			instruccion.executeUpdate("INSERT INTO cliente(DNI, Nombre, Matricula) VALUES ('" 
					+ cliente.getDni() + "'  , '"  + cliente.getNombre() + "' , '" + cliente.getV().getMatricula() + "')");
			//System.out.println(instruccion);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			cerrarConexion(conn, instruccion, null);
		}

	}

	public static boolean comprobarCliente(Cliente cliente) {

		Connection conn = abrirConexion();

		Statement instruccion = null;
		try {

			instruccion = conn.createStatement();

			ResultSet resultado =  instruccion.executeQuery("SELECT dni FROM cliente WHERE dni = '"+cliente.getDni()+"'");
			while (resultado.next()) {
				if(resultado.getString(1).equals(cliente.getDni())){
					return true;
				}
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			cerrarConexion(conn, instruccion, null);
		}

	}
}
