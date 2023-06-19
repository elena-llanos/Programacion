package com.ipartek.formacion.oop.pruebas;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import com.ipartek.formacion.oop.Consola;
import com.ipartek.formacion.oop.pojos.Producto;

public class ProductoPrueba {

	/*
	 * Metodos estáticos ("de clase"): no necesitan new ni clases de otro tipo no
	 * necesitan ni pueden usar variables de instancia La zona de memoria no varía
	 * Es una zona global No se repiten por cada objeto
	 */

	public static void main(String[] args) {

		Producto naranja = new Producto(5L, "Naranja", new BigDecimal("9.25"), LocalDate.of(2024, 9, 8));

		Producto manzana = new Producto();

		manzana.setId(5);
		manzana.setNombre("Manzana");
		manzana.setPrecio(new BigDecimal("1.23"));
		manzana.setFechaCaducidad(LocalDate.of(2024, 6, 8));

		// System.out.println(manzana.obtenerFicha());
		mostrarProducto(naranja);

		Producto pack = Producto.paqueteDosPorUno(naranja, manzana);
		mostrarProducto(pack);

		// como hemos generado el toString();
		System.out.println(manzana);

		ArrayList<Producto> almacen = new ArrayList<>();
		almacen.add(manzana);
		almacen.add(naranja);
		almacen.add(pack);

		for (Producto producto : almacen) {
			System.out.println(producto);
		}

		boolean seguir;

		do {
			Producto p = pedirProducto();

			almacen.add(p);

			seguir = Consola.readBoolean("¿Otro producto?");
		} while (seguir);

		Consola.pl("INFORME DE ALMACEN");

		for (Producto producto : almacen) {
			Consola.pl(producto);
			// mostrarProducto(producto);
		}
	}

	

	/**
	 * @param p
	 */
	private static void mostrarProducto(Producto p) {

		/*
		 * System.out.println(p.getId()); System.out.println(p.getNombre());
		 * System.out.println(p.getPrecio()); System.out.println(p.getFechaCaducidad());
		 */
		System.out.println(p.obtenerFicha());
	}

	private static Producto pedirProducto() {
		Producto p = new Producto();

		Long id = Consola.leerLong("Id");
		p.setId(id);

		String nombre = Consola.leerLinea("Nombre");
		p.setNombre(nombre);

		BigDecimal precio = Consola.leerBigDecimal("Precio");
		p.setPrecio(precio);

		LocalDate caducidad = Consola.leerLocalDate("Caducidad");
		p.setFechaCaducidad(caducidad);

		return p;
	}

}
