package com.ipartek.formacion.oop.pruebas;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ConexionJDBC {

	public static void main(String[] args) throws SQLException {
		final String URL = "jdbc:sqlite:src/productos_db.db";
		final String SQL_SELECT = "SELECT * from productos;";
		final String SQL_SELECT_ID = "SELECT * FROM productos WHERE id=?";
		final String SQL_INSERT = "INSERT INTO productos (nombre, precio, caducidad) VALUES (?,?,?)";
		final String SQL_UPDATE = "UPDATE productos SET nombre=?, precio=?, caducidad=? WHERE id=?";
		final String SQL_DELETE = "DELETE FROM productos WHERE id=?";

		Connection con = DriverManager.getConnection(URL);

		selectAll(SQL_SELECT, con);

		// Consultar por ID
		int id = 9;

		selectById(SQL_SELECT_ID, con, id);

		// Hacer un INSERT
		insertProduct(SQL_INSERT, con);

		// Hacer un UPDATE

		updateProduct(SQL_UPDATE, con, id);

		// Hacer un DELETE
		deleteProduct(SQL_DELETE, con, id);

	}

	/**
	 * @param SQL_SELECT
	 * @param con
	 * @throws SQLException
	 */
	private static void selectAll(final String SQL_SELECT, Connection con) throws SQLException {
		PreparedStatement pst = con.prepareStatement(SQL_SELECT);
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			System.out.printf("%s, %s, %s, %s\n", rs.getInt("id"), rs.getString("nombre"), rs.getBigDecimal("precio"),
					LocalDate.parse(rs.getString("caducidad")));
		}
		rs.close();
		pst.close();
	}

	/**
	 * @param SQL_SELECT_ID
	 * @param con
	 * @param id
	 * @throws SQLException
	 */
	private static void selectById(final String SQL_SELECT_ID, Connection con, int id) throws SQLException {
		PreparedStatement pst;
		ResultSet rs;
		pst = con.prepareStatement(SQL_SELECT_ID);

		pst.setInt(1, id);

		rs = pst.executeQuery();

		if (rs.next()) {
			System.out.printf("%s, %s, %s, %s\n", rs.getInt("id"), rs.getString("nombre"), rs.getBigDecimal("precio"),
					LocalDate.parse(rs.getString("caducidad")));
		} else {
			System.out.println("No se ha encontrado el id " + id);
		}

		rs.close();
		pst.close();
	}

	/**
	 * @param SQL_INSERT
	 * @param con
	 * @throws SQLException
	 */
	private static void insertProduct(final String SQL_INSERT, Connection con) throws SQLException {
		PreparedStatement pst;
		pst = con.prepareStatement(SQL_INSERT);

		pst.setString(1, "Nuevo");
		pst.setBigDecimal(2, new BigDecimal("345"));
		pst.setString(3, LocalDate.now().toString());

		int numeroRegistrosModificados = pst.executeUpdate();

		pst.close();
	}

	/**
	 * @param SQL_UPDATE
	 * @param con
	 * @param id
	 * @throws SQLException
	 */
	private static void updateProduct(final String SQL_UPDATE, Connection con, int id) throws SQLException {
		id = 2;
		PreparedStatement pst;
		int numeroRegistrosModificados;
		pst = con.prepareStatement(SQL_UPDATE);

		pst.setString(1, "Modificado");
		pst.setBigDecimal(2, new BigDecimal("2345234"));
		pst.setString(3, LocalDate.now().toString());
		pst.setInt(4, id);

		numeroRegistrosModificados = pst.executeUpdate();

		pst.close();
	}

	/**
	 * @param SQL_DELETE
	 * @param con
	 * @param id
	 * @throws SQLException
	 */
	private static void deleteProduct(final String SQL_DELETE, Connection con, int id) throws SQLException {
		id = 9;
		PreparedStatement pst;
		int numeroRegistrosModificados;
		pst = con.prepareStatement(SQL_DELETE);

		pst.setInt(1, id);

		numeroRegistrosModificados = pst.executeUpdate();

		pst.close();

		System.out.println(numeroRegistrosModificados);

		con.close();
	}
}
