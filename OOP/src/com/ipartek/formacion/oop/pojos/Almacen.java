package com.ipartek.formacion.oop.pojos;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class Almacen {
	////////////////// Variables de instancia
	private Long id;
	private String nombre;
	private Double latitud;
	private Double longitud;

	private ArrayList<Producto> productos = new ArrayList<>();

	////////////////// Constructores

	public Almacen(Long id, String nombre, Double latitud, Double longitud) {

		/*
		 * this.id = id; 
		 * this.nombre = nombre; 
		 * this.latitud = latitud; 
		 * this.longitud = longitud;
		 */

		setId(id);
		setNombre(nombre);
		setLatitud(latitud);
		setLongitud(longitud);

	}

	////////////////////////// Geter y seter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	//////////////////// To string

	@Override
	public String toString() {
		return "Almacen [id=" + id + ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}

	//////////// Métodos específicos

	public void introducir(Producto p) {
		if (p == null) {
			throw new RuntimeException("NO puede ser null");
		}
		productos.add(p);

	}

	public Producto sacar(Long id) {
		Producto p = null;
		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getId() == id) {
				p = productos.get(i);
				productos.remove(i);
				return p;
			}
		}
		return null;
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Producto> listado(){
		return (ArrayList<Producto>) productos.clone();
	}
	public Producto verPorId(Long id) {
		for (Producto producto: productos) {
			if (producto.getId() == id) {
				return producto;
			}
		}

		return null;
	}
	public Producto cambiar(Producto producto) {

		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getId() == producto.getId()) {
				productos.set(i, producto);
				return producto;
			}
		}

		return null;
	}

}
