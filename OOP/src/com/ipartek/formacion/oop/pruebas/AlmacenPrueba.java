package com.ipartek.formacion.oop.pruebas;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.ipartek.formacion.oop.pojos.Almacen;
import com.ipartek.formacion.oop.pojos.Producto;

public class AlmacenPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Almacen bilbao = new Almacen(1L, "Bilbao", 42.0, -2.0);

		System.out.println(bilbao);

		for (int i = 1; i <= 10; i++) {
			Long id = (long) i;
			String nombre = "Producto " + i;
			BigDecimal precio = new BigDecimal(i + "0");
			LocalDate caducidad = LocalDate.of(2024 + i, i, i * 2);

			Producto producto = new Producto(id, nombre, precio, caducidad);

			bilbao.introducir(producto);
		}

		Producto producto5 = bilbao.sacar(5L);

		System.out.println(producto5);

		producto5 = bilbao.sacar(5L);

		System.out.println(producto5);

		bilbao.listado().add(null);

		System.out.println("LISTADO");

		for (Producto p : bilbao.listado()) {
			System.out.println(p);
		}
	}

}
