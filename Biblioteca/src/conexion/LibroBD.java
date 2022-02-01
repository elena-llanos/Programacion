package conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;

import conexionBD.BDconexion;
import misclases.Libro;

import misclases.Usuario;

public class LibroBD extends BDconexion {
	 
	
			public static boolean anadirLibro(Libro libro) {
				
				Connection conn = abrirConexion();
				
				Statement instruccion = null;

				try {
				
					instruccion = conn.createStatement();
					instruccion.executeUpdate("INSERT INTO libros(isbn, titulo, autor) VALUES('" 
							+ libro.getIsbn() + "','" + libro.getTitulo() + "','" + libro.getAutor() +  "')");
					return true;
				}
					catch (SQLIntegrityConstraintViolationException s) {
						System.out.println("\t\r Usuario registrado");
						return false;
				} catch (SQLException e) {
					e.printStackTrace();
					return false;
				} finally {
					cerrarConexion(conn, instruccion, null);
				}

			}
			public static ArrayList<Libro> obtenerLibros() {

				Connection conn = abrirConexion();
				Statement instruccion = null;
				ResultSet resultado = null;
				ArrayList<Libro> listadoLibros = new ArrayList<Libro>();

				try {
					instruccion = conn.createStatement();
					resultado = instruccion.executeQuery(
					" SELECT isbn, titulo, autor FROM libros "); 
					

					while (resultado.next()) {
						Libro libro = new Libro();
						libro.setIsbn(resultado.getString("isbn"));
						libro.setTitulo(resultado.getString("titulo"));
						libro.setAutor(resultado.getString("autor"));
						listadoLibros.add(libro);
					}
					return listadoLibros;
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				} finally {
					cerrarConexion(conn, instruccion, resultado);
				}

			}
			
			}

